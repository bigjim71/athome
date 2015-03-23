package com.mycompany.athome.server;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpContext;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Minimal Http
 *
 */
public class WebServer {

    public static final int threadPoolSize = 100;

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        HttpContext context = server.createContext("/echo", new Handler());
        //context.getFilters().add(new ParameterFilter());
        server.start();
        System.out.println("server started with threadpool: " + threadPoolSize);
    }
}

class Handler implements HttpHandler {

    //ExecutorService executor = Executors.newFixedThreadPool(App.threadPoolSize);
    ExecutorService executor = Executors.newCachedThreadPool();

    public Handler() {
        System.out.println("creating handler");
    }

    public void handle(HttpExchange xchg) throws IOException {
        executor.execute(new ExecTask(xchg, new ParametersHandler()));
        //can't reclaim the threads, as we need for future requests

        //suggest reclaim some memory in between periods of activity 
        //if(executor.isTerminated()){
        //    System.gc();
        //}
    }

}

class ExecTask implements Runnable {

    HttpExchange xchg;
    ParametersHandler paramsHandler;

    public ExecTask(HttpExchange xchg, ParametersHandler paramsHandler) {
        this.xchg = xchg;
        this.paramsHandler = paramsHandler;
    }

    public void run() {
        try {

            Headers headers = xchg.getResponseHeaders();
//            Set<Map.Entry<String, List<String>>> entries = headers.entrySet();

//            StringBuffer response = new StringBuffer();
//            for (Map.Entry<String, List<String>> entry : entries) {
//                response.append(entry.toString() + "\n");
//            }
            
            InputStream is = WebServer.class.getResourceAsStream("/sample-response.txt");

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            
            byte[] buffer = new byte[1024]; // Adjust if you want
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1)
            {
                bos.write(buffer, 0, bytesRead);
            }            
            
            System.out.println(Thread.currentThread().getId());

            //headers.set("Content-type", String.format("application/json; charset=%s", StandardCharsets.UTF_8));          
            headers.set("Content-type", "application/json");          

            xchg.sendResponseHeaders(200, bos.size());
            
            OutputStream os = xchg.getResponseBody();            
            os.write(bos.toByteArray());
//            OutputStream os = xchg.getResponseBody();
//            os.write(response.toString().getBytes());
            os.close();

        } catch (Exception ex) {
            try {
                Logger.getLogger(ExecTask.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
                System.out.println(Thread.currentThread().getId());

                StringBuffer response = new StringBuffer();
                response.append("Internal Server Error");
                xchg.sendResponseHeaders(500, 100);
                OutputStream os = xchg.getResponseBody();
                os.write(response.toString().getBytes());
                os.close();

            } catch (IOException ex1) {
                Logger.getLogger(ExecTask.class.getName()).log(Level.SEVERE, null, ex1);
                ex1.printStackTrace();
            }
        }
    }
}

class ParametersHandler {

    ConcurrentHashMap<String, Object> parameters;

    public Map parseGetParameters(HttpExchange exchange)
            throws UnsupportedEncodingException {

        parameters = new ConcurrentHashMap<String, Object>();
        URI requestedUri = exchange.getRequestURI();
        String query = requestedUri.getRawQuery();
        parseQuery(query);
        //exchange.setAttribute("parameters", parameters);
        return parameters;
    }

    public void parsePostParameters(HttpExchange exchange)
            throws IOException {

        if ("post".equalsIgnoreCase(exchange.getRequestMethod())) {
            @SuppressWarnings("unchecked")
            Map<String, Object> parameters
                    = (Map<String, Object>) exchange.getAttribute("parameters");
            InputStreamReader isr
                    = new InputStreamReader(exchange.getRequestBody(), "utf-8");
            BufferedReader br = new BufferedReader(isr);
            String query = br.readLine();
            parseQuery(query);
        }
    }

    public Map parseQuery(String query) throws UnsupportedEncodingException {

        if (query != null) {
            String pairs[] = query.split("[&]");

            for (String pair : pairs) {
                String param[] = pair.split("[=]");

                String key = null;
                String value = null;
                if (param.length > 0) {
                    key = URLDecoder.decode(param[0],
                            System.getProperty("file.encoding"));
                }

                if (param.length > 1) {
                    value = URLDecoder.decode(param[1],
                            System.getProperty("file.encoding"));
                }

                if (parameters.containsKey(key)) {
                    Object obj = parameters.get(key);
                    if (obj instanceof List<?>) {
                        List<String> values = (List<String>) obj;
                        values.add(value);
                    } else if (obj instanceof String) {
                        List<String> values = new ArrayList<String>();
                        values.add((String) obj);
                        values.add(value);
                        parameters.put(key, values);
                    }
                } else {
                    parameters.put(key, value);
                }
            }
        }
        return parameters;
    }
    
    private static String decodeUrlComponent(final String urlComponent) throws UnsupportedEncodingException {
            return URLDecoder.decode(urlComponent, StandardCharsets.UTF_8.name());
    }    

}
