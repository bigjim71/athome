/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.athome.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import javax.ws.rs.core.MediaType;



/**
 *
 * @author fh231
 */
public class AthomeClient {
    
    Client client;

    public AthomeClient() {

        ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        this.client = Client.create(clientConfig);
    }
    
    public Client getClient(){
        return client;
    }
    
    
  public void xxx(String[] args) {
	try {
 
		client = Client.create();
 
		WebResource webResource = client
		   .resource("http://localhost:8000/echo");

 
//		ClientResponse response = webResource.accept("application/json")
//                   .get(ClientResponse.class);
                
		String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
 
		ClientResponse response = webResource.type(MediaType.APPLICATION_JSON)
		   .post(ClientResponse.class, input);                
 
		if (response.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ response.getStatus());
		}
                
//            ClientConfig clientConfig = new DefaultClientConfig();
//clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
//
//ClientResponse res =  Client.create(clientConfig).
//            resource("adlkfjalkjd/alskjdflajsfd").accept(MediaType.APPLICATION_JSON).
//            header("content-type", MediaType.APPLICATION_JSON).
//            get(MY_RESPONSE.class); 
//MyReponse output = response.getEntity(MyResponse.class);                
 
		String output = response.getEntity(String.class);
 
		System.out.println("Output from Server .... \n");
		System.out.println(output);
 
	  } catch (Exception e) {
 
		e.printStackTrace();
 
	  }
 
	}    
  
  
}
