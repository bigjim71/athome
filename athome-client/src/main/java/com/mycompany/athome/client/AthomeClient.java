/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.athome.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientResponse;



/**
 *
 * @author fh231
 */
public class AthomeClient {
    
    Client client;

    public AthomeClient() {

        this.client = ClientBuilder.newClient();
    }
    
    public Client getClient(){
        return client;
    }
    
    
  public void xxx(String[] args) {
	try {
 
		client = ClientBuilder.newClient();
 
		WebTarget webResource = client
		   .target("http://localhost:8000/echo");

 
//		ClientResponse response = webResource.accept("application/json")
//                   .get(ClientResponse.class);
                
		String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
 
		Response response = webResource.request(MediaType.APPLICATION_JSON)
				.post(Entity.entity(input, MediaType.APPLICATION_JSON));                
 
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
 
		String output = response.readEntity(String.class);
 
		System.out.println("Output from Server .... \n");
		System.out.println(output);
 
	  } catch (Exception e) {
 
		e.printStackTrace();
 
	  }
 
	}    
  
  
}
