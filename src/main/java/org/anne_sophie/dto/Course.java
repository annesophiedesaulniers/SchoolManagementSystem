package org.anne_sophie.dto;

import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;

/**
 * Course
 *
 * @author Anne-Sophie Desaulniers
 */

@Getter
public class Course {
    private double credit;
    private String courseId;
    private static int nextId = 1;
    private Student[] students;
    private Department department;
    private int numOfStudents;
    private Teacher teacher;
    private String courseName;
    
    public Course(String courseName, double credit, Department department) {
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.courseId = String.format("C%03d", nextId++);
        this.numOfStudents = 0;
        this.students = new Student[5];
    }
    @Override
    public String toString() {
        return "Course{id='" + courseId + "', courseName='" + courseName + "', credit=" + credit +
                ", teacher=" + teacher + ", department='" + department + "', students=" +
                Arrays.toString(students) + "}";
    }
}
