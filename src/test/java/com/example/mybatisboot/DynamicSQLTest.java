package com.example.mybatisboot;

import com.example.mybatisboot.entity.Employee;
import com.example.mybatisboot.mapper.DynamicSQLMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class DynamicSQLTest {
    @Autowired
    private DynamicSQLMapper mapper;

    @Test
    public void test1(){
        System.out.println(mapper.getEmpByColumn(null,"%st%",null,null));
    }
    @Test
    public void test2(){
        Employee e = new Employee();
       // e.setLastName("%st");
        //啥条件都没有，查询salary > 6000的
        System.out.println(mapper.getEmpByOneColumn(e));
    }

    @Test
    public void test3(){
        Employee e = new Employee();
        e.setId(105);
        e.setLastName("Austin");
        e.setSalary(6000.0);
        mapper.updateEmpByDynamicSQL(e);
    }

    @Test
    public void test4(){
        System.out.println(mapper.getEmpsByConditionForeach(Arrays.asList(100,101,109)));
    }
}
