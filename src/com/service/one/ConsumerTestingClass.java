/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.one;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class ConsumerTestingClass {
    public static void main(String [] args){
        URL url = null;
        QName qname = null;
        Service service = null;
        TimeServer timeServer = null;
        try{
            url = new URL("http://localhost:9876/testing?wsdl");
            qname = new QName("http://one.service.com/", "TimeServerImplService");
            service = Service.create(url, qname);
            timeServer = service.getPort(TimeServer.class);
            System.out.println("---> "+timeServer.getTimeAsString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
