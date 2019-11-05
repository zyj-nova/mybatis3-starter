package com.example.mybatisboot.mapper;

import com.example.mybatisboot.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMapper {

    Employee getEmpAndDept(int id);

    Employee getEmployeeByDeptId(int id);
}
