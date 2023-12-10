package org.anne_sophie;

import org.anne_sophie.dto.SchoolManagementSystem;

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

        System.out.println(schoolManagementSystem.findCourse("C001"));
        System.out.println(schoolManagementSystem.findTeacher("T001"));
        System.out.println(schoolManagementSystem.findStudent("S001"));
        System.out.println(schoolManagementSystem.findDepartment("D001"));

        schoolManagementSystem.modifyCourseTeacher("T001", "C001");
        schoolManagementSystem.registerCourse("C001", "S001");
    }
}
