/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.one;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TimeServer {
    
    @WebMethod
    String getTimeAsString() throws Exception;
}
