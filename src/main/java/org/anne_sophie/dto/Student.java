package org.anne_sophie.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

/**
 * Student
 *
 * @author Anne-Sophie Desaulniers
 */

@Getter
@Setter
public class Student {
    private String fname;
    private String lname;
    private Course[] registeredCourses;
    private String studentId;
    private static int nextId = 1;
    private Department department;
    private int numOfCourses;
    public static final int MAX_COURSE_NUM = 5;

    public Student(String fname, String lname, Department department) {
    this.fname = fname;
    this.lname = lname;
    this.department = department;
    this.studentId = String.format("S%03d", nextId++);
    this.registeredCourses = new Course[5];
    }

    /**
     * combines the first name and the last name of the student
      * @return the full name of the student
     */
    public String fullName() {
        return fname + " " + lname;
    }

    /**
     * adds the course to the student's courses array
     * @return the updated info of the student
     */
    public String toString( ) {
        String courseArray = "[";
        for (int i = 0; i < registeredCourses.length; i++) {
            if (registeredCourses[i] != null) {
                courseArray += registeredCourses[i].getCourseName() + ", ";
            }
        }
        courseArray += "]";
        return "Student{id=" + studentId + ", fname=" + fname + ", lname=" + lname + ", department=" +
                "Department(id=" + department.getDepartmentId() + ", departmentName=" + department.getDepartmentName()
                + ", courseNum=" + numOfCourses + ", courses=" + courseArray + "}";
    }
}
