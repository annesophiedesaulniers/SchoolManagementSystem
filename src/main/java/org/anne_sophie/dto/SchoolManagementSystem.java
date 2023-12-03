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
     * searches for a department based on its id
     * @param Department the depatment we are looking for
     */
    public String findDepartment(String Department) {
        
    }

    /**
     * displays all the teachers
     */
    public void printTeachers() {
        
    }

    /**
     * modifies the teacher of a course
     * @param teacherId the new teacher of the course
     * @param courseId the course we want the teacher to be modified
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {
        
    }

    /**
     * adds a new department
     * @param departmentId the id of the new department
     */
    public void addDepartment(String departmentId) {
        
    }

    /**
     * displays all the students
     */
    public void printStudents() {
        
    }

    /**
     * searches for a student based on its id 
     * @param Student the student we are looking for
     */
    public String findStudents(String Student) {
        
    }

    /**
     * adds a new course
     * @param courseId the id of the new course
     * @param credit the amount of credits of the new course
     * @param courseName the name of the new course
     */
    public void addCourse(String courseId, double credit, String courseName) {
        
    }

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
     * adds a new teacher
     * @param teacherId the id of the new teacher
     * @param fname the first name of the new teacher
     * @param lname the last name of the new teacher
     */
    public void addTeacher(String teacherId, String fname, String lname) {
        
    }

    /**
     * searches for a course based on its id
     * @param Course the course we are looking for
     */
    public String findCourse(String Course) {
        
    }

    /**
     * displays all the departments
     */
    public void printDepartment() {
        
    }

    /**
     * adds a new student
     * @param studentId the id of the new student
     * @param fname the first name of the new student
     * @param lname the last name of the new student
     */
    public void addStudent(String studentId, String fname, String lname) {
        
    }

    /**
     * searches for a teacher based on its id
     * @param Teacher the teacher we are looking for
     */
    public String findTeacher(String Teacher) {
        
    }
}