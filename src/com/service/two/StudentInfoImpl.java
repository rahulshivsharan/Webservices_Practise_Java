/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.two;

import java.util.List;
import javax.jws.WebService;


@WebService(endpointInterface = "com.service.two.StudentInfo")
public class StudentInfoImpl implements StudentInfo {

    @Override
    public Student getStudent(String rollNo) throws Exception {
        return StudentUtils.getStudent(rollNo);
    }

    @Override
    public List<Student> getList() throws Exception {
        return StudentUtils.getStudents();
    }
}
