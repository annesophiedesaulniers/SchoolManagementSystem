package org.anne_sophie.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

/**
 * Course
 *
 * @author Anne-Sophie Desaulniers
 */

@Getter
@Setter
public class Course {
    private double credit;
    private String courseId;
    private static int nextId = 1;
    private Student[] registeredStudents;
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
        this.registeredStudents = new Student[5];
    }

    /**
     * adds the student to the course's students array
     * @return the updated info of the course
     */
    @Override
    public String toString() {
        String studentArray = "[";
        for (int i = 0; i < registeredStudents.length; i++) {
            if (registeredStudents[i] != null) {
                studentArray += registeredStudents[i].fullName() + ", ";
            }
        }
        studentArray += "]";
        return "Course{id=" + courseId + ", courseName=" + courseName + ", credit=" + credit + ", teacher=" + teacher + ", department=" +
                "Department(id=" + department.getDepartmentId() + ", departmentName=" + department.getDepartmentName()
                +  ", students=" + studentArray + "}";
    }
}
