/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.one;

import javax.xml.ws.Endpoint;


public class MainTestClass {
    public static void main(String [] args){
        try{
            Endpoint.publish("http://localhost:9876/testing", new TimeServerImpl());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
