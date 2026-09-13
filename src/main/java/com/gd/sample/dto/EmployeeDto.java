package com.gd.sample.dto;

public class EmployeeDto {
    private int empId;
    private String name;
    private int exp;

    public EmployeeDto(int empId, String name, int exp) {
        this.empId = empId;
        this.exp = exp;
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
