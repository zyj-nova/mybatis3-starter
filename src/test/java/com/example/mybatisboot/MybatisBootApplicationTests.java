package com.example.mybatisboot;

import com.example.mybatisboot.entity.Major;
import com.example.mybatisboot.mapper.MajorMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisBootApplicationTests {

    @Autowired
    MajorMapper mapper;
    @Test
    void contextLoads() {
    }

    @Test
    public void test1(){
        Major major = mapper.getMajorById(2);
        System.out.println(major);
    }

    @Test
    public void test2(){
        System.out.println(mapper.getAllMajors());
    }

    @Test
    public void test3(){
        Major major = new Major("math");
        mapper.addMajor(major);
        System.out.println(major.getMajorId());
    }

    @Test
    public void test4(){
        Major m = mapper.getMajorByIdAndName(7,"math");
        System.out.println(m);
    }

    @Test
    public void test5(){
        Major major = new Major("math");
        major.setMajorId(7);
        //mapper.updateMajor(major);
        List<Major> list = new ArrayList<>();
        list.add(major);
        mapper.updateMajors(list);
    }

    @Test
    public void test6(){
        int arr[] = {1,2,3};
        Major m = mapper.getMajorByArray(arr);
        System.out.println(m);
    }
    @Test
    public void test7(){
        Map<String,String> map = new HashMap<>();
        map.put("tablename","major");
        map.put("id","2");
        Major m = mapper.getMajorByMap(map);
        System.out.println(m);
    }

    @Test
    public void test8(){
        Map map = mapper.getMajorReturnMap();
        System.out.println(map);
    }
}
