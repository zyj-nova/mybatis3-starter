package com.example.mybatisboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mybatisboot.mapper")
@SpringBootApplication
public class MybatisBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(MybatisBootApplication.class, args);
    }

}
