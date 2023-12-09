package org.anne_sophie;

import org.anne_sophie.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();

        schoolManagementSystem.addDepartment("Computer Science");
        schoolManagementSystem.addCourse("Programming", 3, "D001");
        schoolManagementSystem.addTeacher("Yi", "Wang", "D001");
        schoolManagementSystem.addStudent("Anne-Sophie", "Desaulniers", "D001");

        schoolManagementSystem.displayTeachers();
        schoolManagementSystem.displayDepartments();
        schoolManagementSystem.displayCourses();
        schoolManagementSystem.displayStudents();

        //schoolManagementSystem.findCourse();
        //schoolManagementSystem.findTeacher();
        //schoolManagementSystem.findStudent();
        //schoolManagementSystem.findDepartment();

        //schoolManagementSystem.modifyCourseTeacher();
        //schoolManagementSystem.registerCourse();
    }
}