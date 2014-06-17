
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
