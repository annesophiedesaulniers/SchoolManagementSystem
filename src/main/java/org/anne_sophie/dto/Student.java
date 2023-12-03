package org.anne_sophie.dto;

import lombok.ToString;

import java.util.Arrays;

/**
 * Student
 *
 * @author Anne-Sophie Desaulniers
 */
@ToString
public class Student {
    private String fname;
    private String lname;
    private Course[] courses;
    private String studentId;
    private static int nextId = 1;
    private Department department;
    private int courseNum;

    public Student(String fname, String lname, Department department) {
    this.fname = fname;
    this.lname = lname;
    this.department = department;
    this.studentId = String.format("S%03d", nextId++);
    this.courses = new Course[5];
        }
    public String toString() {
        return "Student{id='" + studentId + "', fname='" + fname + "', lname='" + lname +
                "', department=" + department + ", courseNum=" + courseNum +
                ", courses=" + Arrays.toString(courses) + "}";
    }
}


