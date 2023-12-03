package org.anne_sophie.dto;

import lombok.Getter;
import lombok.ToString;

/**
 * Department
 *
 * @author Anne-Sophie Desaulniers
 */
@Getter
public class Department {
    private String departmentId;
    private static int nextId = 1;
    private String departmentName;
    
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.departmentId = String.format("D%03d", nextId);
    }
    @Override
    public String toString() {
        return "Department(id=" + departmentId + ", departmentName='" + departmentName + "')";
    }
}