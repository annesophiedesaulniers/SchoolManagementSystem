package org.anne_sophie;

import org.anne_sophie.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();

        schoolManagementSystem.addDepartment();
        schoolManagementSystem.addCourse();
        schoolManagementSystem.addTeacher();
        schoolManagementSystem.addStudent();

        schoolManagementSystem.displayTeachers();
        schoolManagementSystem.displayDepartments();
        schoolManagementSystem.displayCourses();
        schoolManagementSystem.displayStudents();

        schoolManagementSystem.findCourse();
        schoolManagementSystem.findTeacher();
        schoolManagementSystem.findStudent();
        schoolManagementSystem.findDepartment();

        schoolManagementSystem.modifyCourseTeacher();
        schoolManagementSystem.registerCourse();
    }
}