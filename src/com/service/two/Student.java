/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.two;

import java.io.Serializable;


public class Student implements Serializable {

    private String studentName;
    private String studentNo;
    private String address;

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public Student setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    /**
     * @return the studentNo
     */
    public String getStudentNo() {
        return studentNo;
    }

    /**
     * @param studentNo the studentNo to set
     */
    public Student setStudentNo(String studentNo) {
        this.studentNo = studentNo;
        return this;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public Student setAddress(String address) {
        this.address = address;
        return this;
    }
    
    @Override
    public String toString(){
        StringBuffer strb = new StringBuffer();
        strb.append("\nSTUDENT NAME ").append(this.studentName)
            .append("\nROLL-NO ").append(this.studentNo)
            .append("\nADDRESS ").append(this.address);
        return strb.toString();
    }
}
