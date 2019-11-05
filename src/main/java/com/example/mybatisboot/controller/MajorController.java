package com.example.mybatisboot.controller;


import com.example.mybatisboot.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/major")
public class MajorController {
    @Autowired
    private MajorService majorService;


    @GetMapping("/{id}")
    public String getMajor(@PathVariable("id") int id){
        return majorService.getMajorById(id).toString();
    }
}
