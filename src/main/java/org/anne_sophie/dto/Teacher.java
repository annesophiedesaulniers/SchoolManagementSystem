package org.anne_sophie.dto;

import lombok.ToString;
@ToString
public class Teacher {
    private String fname;
    private String lname;
    private Department department;
    private String id;
    private static int nextId = 1;
    
    public Teacher(String fname, String lname, Department department) {
        
    }
    

}