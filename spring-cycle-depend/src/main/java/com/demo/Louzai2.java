package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Louzai2 {
    @Autowired
    private Louzai1 louzai1;

    public void test2() {
    }
}
