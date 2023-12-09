package org.anne_sophie;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.anne_sophie.dto.Course;
import org.anne_sophie.dto.Department;
import org.anne_sophie.dto.Student;
import org.anne_sophie.dto.Teacher;

import java.util.Arrays;

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
            Department newDepartment = new Department(departmentName);
            departments[numOfDepartments++] = newDepartment;
            System.out.println("Department " + newDepartment + " added successfully.");
        } else {
            System.out.println("Max department reached, add a new department failed");
        }
    }

    /**
     * adds a new course
     * @param courseName the name of the new course
     * @param credit     the amount of credits of the new course
     * @param departmentId the ID of department of the new course
     */
    public void addCourse(String courseName, double credit, String departmentId) {
        if (numOfCourses < 30) {
            Department department = findDepartment(departmentId);
            if (department != null) {
                Course newCourse = new Course(courseName, credit, department);
                courses[numOfCourses++] = newCourse;
                System.out.println("Course " + newCourse + " added successfully.");
            } else System.out.println("Department with ID " + departmentId + " not found.");
        } else {
            System.out.println("Max course reached, add a new course failed.");
        }
    }

    /**
     * adds a new teacher
     * @param fname      the first name of the new teacher
     * @param lname      the last name of the new teacher
     * @param departmentId the ID of the department of the new teacher
     */
    public void addTeacher(String fname, String lname, String departmentId) {
        if (numOfTeachers < 20) {
            Department department = findDepartment(departmentId);
            if (department != null) {
                Teacher newTeacher = new Teacher(fname, lname, department);
                teachers[numOfTeachers++] = newTeacher;
                System.out.println("Teacher " + newTeacher + " added successfully.");
            } else System.out.println("Department with ID " + departmentId + " not found.");
        } else {
            System.out.println("Max teacher reached, add a new teacher failed.");
        }
    }

    /**
     * adds a new student
     * @param fname the first name of the new student
     * @param lname the last name of the new student
     * @param departmentId the ID of the department of the new student
     */
    public void addStudent(String fname, String lname, String departmentId) {
        if (numOfStudents < 200) {
            Department department = findDepartment(departmentId);
            if (department!= null) {
                Student newStudent = new Student(fname, lname, department);
                students[numOfStudents++] = newStudent;
                System.out.println("Student " + newStudent + " added successfully.");
            } else System.out.println("Department with ID " + departmentId + " not found.");
        } else {
            System.out.println("Max student reached, add a new student failed.");
        }
    }

    /**
     * displays all the departments
     */
    public void displayDepartments() {
        System.out.println("Departments: ");
        for (Department department : departments) {
            if (department != null) {
                System.out.println(department);
            }
        }
    }

    /**
     * displays all the teachers
     */
    public void displayTeachers() {
        System.out.println("Teachers: ");
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println(teacher);
            }
        }
    }

    /**
     * displays all the students
     */
    public void displayStudents() {
        System.out.println("Students: ");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    /**
     * displays all the courses
     */
    public void displayCourses() {
        System.out.println("Courses: ");
        for (Course course : courses) {
            if (course != null) {
                System.out.println(course);
            }
        }
    }


    /**
     * searches for a department based on its id
     * @param departmentId the ID of the department we are looking for
     */
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (department != null && department.getDepartmentId().equals(departmentId)) {
                return department;
            }
        }
        return null;
    }


    /**
     * searches for a student based on its id
     * @param studentId the ID of the student we are looking for
     */
    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student != null && student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    /**
     * searches for a course based on its id
     * @param courseId the ID of the course we are looking for
     */
    public Course findCourse(String courseId) {
        for (Course course : courses) {
            if (course != null && course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    /**
     * searches for a teacher based on its id
     * @param teacherId the ID of the teacher we are looking for
     */
    public Teacher findTeacher(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher != null && teacher.getTeacherId().equals(teacherId)) {
                return teacher;
            }
        }
        return null;
    }

    /**
     * registers a student in a course
     * @param courseId  the id of the course we want to register a student in
     * @param studentId the id of the student we want ot register in the course
     */
    public void registerCourse(String courseId, String studentId) {

    }

    /**
     * modifies the teacher of a course
     * @param teacherId the new teacher of the course
     * @param courseId  the course we want the teacher to be modified
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {
        Teacher newTeacher = null;
        Course targetCourse = null;

    }
}

