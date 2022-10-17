package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Louzai1 {

    @Autowired
    private Louzai2 louzai2;

    public void test1() {
    }
}
