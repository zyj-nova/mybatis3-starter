package com.example.mybatisboot.mapper;

import com.example.mybatisboot.entity.Employee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DynamicSQLMapper {

    List<Employee> getEmpByColumn(@Param("id") Integer id, @Param("lastName") String lastName,
                        @Param("salary") Double salary, @Param("deptid") Integer depid);

    List<Employee> getEmpByOneColumn(Employee e);

    boolean updateEmpByDynamicSQL(Employee e);

    //查询在给定id集合中的员工
    List<Employee> getEmpsByConditionForeach(@Param("ids") List<Integer> list);
}
