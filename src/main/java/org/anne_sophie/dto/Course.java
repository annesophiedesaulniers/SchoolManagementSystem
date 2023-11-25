package org.anne_sophie.dto;

import lombok.ToString;
@ToString
public class Course {
    private double credit;
    private String id;
    private static int nextId = 1;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;
    
    public Course(String courseName, double credit, Department department) {
        
    }

}