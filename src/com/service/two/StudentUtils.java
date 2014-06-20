/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StudentUtils {

    static {
        studentList = new ArrayList<Student>() {
            {
                add(new Student().setAddress("Dadar").setStudentName("Amit Pathak").setStudentNo("AMTP985"));
                add(new Student().setAddress("Matunga").setStudentName("Rahul Sarpoddar").setStudentNo("RASP426"));
                add(new Student().setAddress("Sion").setStudentName("Harish Pise").setStudentNo("HARP234"));
                add(new Student().setAddress("Kurla").setStudentName("Aseem Kulkarni").setStudentNo("ASMK422"));
                add(new Student().setAddress("Vikroli").setStudentName("Suresh Pai").setStudentNo("SURP552"));
                add(new Student().setAddress("Ghatkopar").setStudentName("Mehul Sakhardande").setStudentNo("MEHS213"));
                add(new Student().setAddress("Vidyavihar").setStudentName("Jeevan Dharmadikari").setStudentNo("JEVD617"));
            }
        };

        maps = new HashMap<String, Student>();

        for (Student student : StudentUtils.studentList) {
            StudentUtils.maps.put(student.getStudentNo(), student);
        }
    }
    
    private static List<Student> studentList;
    private static Map<String, Student> maps;

    public static List<Student> getStudents() {
        return StudentUtils.studentList;
    }

    public static Student getStudent(String rollNo) {
        return StudentUtils.maps.get(rollNo);
    }
}
