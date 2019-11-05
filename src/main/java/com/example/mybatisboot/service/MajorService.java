package com.example.mybatisboot.service;

import com.example.mybatisboot.entity.Major;
import com.example.mybatisboot.mapper.MajorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MajorService {
    @Autowired
    private MajorMapper majorMapper;

    public Major getMajorById(int id){
        return majorMapper.getMajorById(id);
    }
}
