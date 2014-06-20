/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.two;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class ServiceConsumerTest {
    public static void main(String [] args){
        URL url = null;
        QName qName = null;
        Service service = null;
        StudentInfo studentInfo = null;
        try{
            url = new URL("http://localhost:9876/go?wsdl");
            qName = new QName("http://two.service.com/","StudentInfoImplService");
            service = Service.create(url, qName);
            studentInfo = service.getPort(StudentInfo.class);
            System.out.println("----> "+studentInfo.getStudent("SURP552"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
