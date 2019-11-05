package com.example.mybatisboot.entity;

import lombok.Data;

import java.util.List;

@Data
public class Department {
    private int departmentId;

    private String departmentName;

    private List<Employee> emps;

    @Override
    public String toString(){
        return "Department:(id:"+this.departmentId+ ",name:" + this.departmentName + ")";
    }
}
