package com.example.mybatisboot;

import com.example.mybatisboot.entity.Department;
import com.example.mybatisboot.entity.Employee;
import com.example.mybatisboot.mapper.DepartmentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DepartmentRepoTest {
    @Autowired
    private DepartmentMapper mapper;

    @Test
    public void test1(){
        System.out.println(mapper.getAllDepartments());
    }

    @Test
    public void test2(){
        System.out.println(mapper.getDeptById(60));

    }

    @Test
    public void test3(){
        Department d = mapper.getDeptAndEmps(60);
        System.out.println(d.getDepartmentName());

        for (Employee e:d.getEmps()){
            System.out.println(e);
        }
    }

    @Test
    public void test4(){
        Department d = mapper.getDeptStep(100);
        System.out.println(d.getDepartmentName());

        System.out.println(d.getEmps());
    }
}
