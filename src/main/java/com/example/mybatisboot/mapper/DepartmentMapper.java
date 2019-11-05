package com.example.mybatisboot.mapper;

import com.example.mybatisboot.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentMapper {

    List<Department> getAllDepartments();

    Department getDeptById(int id);

    Department getDeptAndEmps(int deptid);

    Department getDeptStep(int deptid);
}
