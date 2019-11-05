package com.example.mybatisboot;

import com.example.mybatisboot.entity.Employee;
import com.example.mybatisboot.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeRepoTest {
    @Autowired
    EmployeeMapper mapper;

    @Test
    public void tets1(){
        Employee e = mapper.getEmpAndDept(100);
        System.out.println(e.getLastName());
       // System.out.println(e);
        System.out.println(e.getDept().getDepartmentName());
    }
}
