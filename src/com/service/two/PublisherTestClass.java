/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.two;

import com.service.two.StudentInfoImpl;
import javax.xml.ws.Endpoint;


public class PublisherTestClass {
    public static void main(String [] args){
        try{
            Endpoint.publish("http://localhost:9876/go", new StudentInfoImpl());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
