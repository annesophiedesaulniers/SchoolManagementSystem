package org.anne_sophie.dto;

import lombok.ToString;

/**
 * Department
 *
 * @author Anne-Sophie Desaulniers
 */
@ToString
public class Department {
    private String departmentId;
    private static int nextId = 1;
    private String departmentName;
    
    public Department(String departmentName) {
        this.departmentId = departmentName;
        this.departmentId = String.format("D%03d", nextId);
    }
}