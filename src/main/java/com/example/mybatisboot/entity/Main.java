package com.example.mybatisboot.entity;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < 12; i++){
            map.put(i,i);
        }
        System.out.println(map.size());

    }
}
