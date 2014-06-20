/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.two;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;



@WebService
@SOAPBinding(style= SOAPBinding.Style.DOCUMENT)
public interface StudentInfo {
    
    @WebMethod
    Student getStudent(String rollNo) throws Exception;
    
    @WebMethod
    List<Student> getList() throws Exception;
}
