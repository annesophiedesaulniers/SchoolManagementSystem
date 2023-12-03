package org.anne_sophie.dto;

import lombok.ToString;

/**
 * Teacher
 *
 * @author Anne-Sophie Desaulniers
 */
@ToString
public class Teacher {
    private String fname;
    private String lname;
    private Department department;
    private String teacherId;
    private static int nextId = 1;
    
    public Teacher(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.teacherId = String.format("T%03d", nextId);
    }
}
    

