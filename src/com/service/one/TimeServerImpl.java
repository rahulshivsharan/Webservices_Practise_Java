/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.one;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.jws.WebService;


@WebService(endpointInterface="com.service.one.TimeServer")
public class TimeServerImpl implements TimeServer{

    @Override
    public String getTimeAsString() throws Exception{
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        return df.format(cal.getTime());
    }
    
}
