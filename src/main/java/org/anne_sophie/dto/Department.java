package org.anne_sophie.dto;

import lombok.ToString;
@ToString
public class Department {
    private String id;
    private static int nextId = 1;
    private String departmentName;
    
    public Department(String departmentName) {
        
    }

}