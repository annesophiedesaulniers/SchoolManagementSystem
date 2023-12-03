package org.anne_sophie.dto;

import lombok.ToString;

/**
 * Course
 *
 * @author Anne-Sophie Desaulniers
 */
@ToString
public class Course {
    private double credit;
    private String courseId;
    private static int nextId = 1;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;
    
    public Course(String courseName, double credit, Department department) {
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.courseId = String.format("C%03d", nextId);
    }
}
