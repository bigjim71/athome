/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.athome.server.wildfly;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author fh231
 */

@Path("/data")
public class RestfulData {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public MyJaxbBean getMyBean() {
        return new MyJaxbBean("Agamemnon", 32);
    }
    
}
