/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.athome.server.wildfly;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fh231
 */
@XmlRootElement
public class MyJaxbBean {
    public String name;
    public int age;
 
    public MyJaxbBean() {} // JAXB needs this
 
    public MyJaxbBean(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
