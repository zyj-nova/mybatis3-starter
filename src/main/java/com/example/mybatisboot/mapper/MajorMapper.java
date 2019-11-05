package com.example.mybatisboot.mapper;

import com.example.mybatisboot.entity.Major;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MajorMapper {

     Major getMajorById(Integer id);

     List<Major> getAllMajors();

     boolean addMajor(Major m);

     Major getMajorByIdAndName(@Param("id") int id, @Param("name") String name);

     boolean updateMajor(@Param("major") Major major);

     boolean updateMajors(List<Major> majors);

     Major getMajorByArray(int arrs[]);
     //参数为map对象
     Major getMajorByMap(Map<String,String> map);

     //返回类型为map,多条记录Map<String,Major>
     //指定返回的map中，key的类型，
     @MapKey("majorId")
     Map<Integer,Major> getMajorReturnMap();
}
