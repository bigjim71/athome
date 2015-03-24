/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.athome.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

/**
 *
 * @author fh231
 */
public class ResponseTests {
    
    public ResponseTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void t1() {
    
//        AthomeClient atc = new AthomeClient();
//        Client client = atc.getClient();
        Client client = ClientBuilder.newClient();
        // let jersey know about our entity
        client.register(AthomeResponseEntity.class);
        // tell jersey not to care if we haven't mapped every property in the JSON
        JacksonJsonProvider jacksonJsonProvider = 
        	    new JacksonJaxbJsonProvider()
        	        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
       	client.register(jacksonJsonProvider);           
        
        Response response = client
                .target("http://localhost:8000/echo")
                .request(MediaType.APPLICATION_JSON)
                .header("content-type", MediaType.APPLICATION_JSON)
                .get();
        
        System.out.println("response length: "+ response.getLength());

        AthomeResponseEntity atRes = response.readEntity(AthomeResponseEntity.class);
        
    }
}
