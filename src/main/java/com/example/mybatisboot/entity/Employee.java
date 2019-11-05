package com.example.mybatisboot.entity;

import lombok.Data;

@Data
public class Employee {
    private Integer id;

    private String lastName;

    private Double salary;

    private Department dept;
}
