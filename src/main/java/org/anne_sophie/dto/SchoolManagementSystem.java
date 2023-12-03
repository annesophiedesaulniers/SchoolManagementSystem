package org.anne_sophie;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.anne_sophie.dto.Course;
import org.anne_sophie.dto.Department;
import org.anne_sophie.dto.Student;
import org.anne_sophie.dto.Teacher;

/**
 * School management system
 * 
 * @author Anne-Sophie Desaulniers
 */

@Getter
@Setter
@EqualsAndHashCode
public class SchoolManagementSystem {
    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;
    private int numOfDepartments;
    private int numOfStudents;
    private int numOfTeachers;
    private int numOfCourses;

    public SchoolManagementSystem() {
        this.departments = new Department[5];
        this.students = new Student[200];
        this.teachers = new Teacher[20];
        this.courses = new Course[30];
        this.numOfDepartments = 0;
        this.numOfStudents = 0;
        this.numOfTeachers = 0;
        this.numOfCourses = 0;
    }

    /**
     * adds a new department
     * @param departmentName the id of the new department
     */
    public void addDepartment(String departmentName) {
        if (numOfDepartments < 5) {
            Department department = new Department(departmentName);
            departments[numOfDepartments++] = department;
            System.out.println("Successfully added department " + department);
        } else {
            System.out.println("Limit of 5 departments. Unable to add a new department.");
        }
    }

    /**
     * adds a new course
     * @param courseId the id of the new course
     * @param credit the amount of credits of the new course
     * @param courseName the name of the new course
     */
    public void addCourse(String courseId, double credit, String courseName) {
        if (numOfCourses < 30) {
            courses[numOfCourses++] = new Course(courseId, credit, courseName);
            System.out.println("Successfully added course Course " + courseId, courseName, credit);
        } else {
            System.out.println("Limit of 30 courses. Unable to add a new course.");
        }
    }

    /**
     * adds a new teacher
     * @param teacherId the id of the new teacher
     * @param fname the first name of the new teacher
     * @param lname the last name of the new teacher
     */
    public void addTeacher(String teacherId, String fname, String lname) {
        if (numOfTeachers < 20) {
            teachers[numOfTeachers++] = new Teacher(teacherId, fname, lname);
            System.out.println("New teacher added.");
        } else {
            System.out.println("Limit of 20 teachers. Unable to add a new teacher.");
        }
    }

    /**
     * adds a new student
     * @param studentId the id of the new student
     * @param fname the first name of the new student
     * @param lname the last name of the new student
     */
    public void addStudent(String studentId, String fname, String lname) {
        if (numOfStudents < 200) {
            students[numOfStudents++] = new Student(studentId, fname, lname);
            System.out.println("New student added.");
        } else {
            System.out.println("Limit of 200 students. Unable to add a new student.");
        }
    }

    public void printDepartment() {
        System.out.println("Departments: ");
        for (Department department : departments) {
            if (department != null) {
                System.out.println(departmentId, departmentName);
            }
        }
    }

    /**
     * displays all the teachers
     */
    public void printTeachers() {

    }

    /**
     * displays all the students
     */
    public void printStudents() {

    }

    /**
     * displays all the courses
     */
    public void printCourses() {

    }


    /**
     * searches for a department based on its id
     * @param Department the depatment we are looking for
     */
    public String findDepartment(String Department) {
        
    }

    /**
     * searches for a student based on its id
     * @param Student the student we are looking for
     */
    public String findStudents(String Student) {

    }

    /**
     * searches for a course based on its id
     * @param Course the course we are looking for
     */
    public String findCourse(String Course) {

    }

    /**
     * searches for a teacher based on its id
     * @param Teacher the teacher we are looking for
     */
    public String findTeacher(String Teacher) {

    }

    /**
     * displays all the departments
     */

    /**
     * registers a student in a course
     * @param courseId the id of the course we want to register a student in
     * @param studentId the id of the student we want ot register in the course
     */
    public void registerCourse(String courseId, String studentId) {
        if (numOfCourses < 5) {

        }
    }

    /**
     * modifies the teacher of a course
     * @param teacherId the new teacher of the course
     * @param courseId the course we want the teacher to be modified
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {

    }

}