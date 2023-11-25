package org.anne_sophie.dto;

import lombok.ToString;
@ToString
public class Student {
    private String fname;
    private String lname;
    private Course courses;
    private String id;
    private static int nextId = 1;
    private Departement departement;

    public Student(String fname, String lname, Department department) {

    }

}

