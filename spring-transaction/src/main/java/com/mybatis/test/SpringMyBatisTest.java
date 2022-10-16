package com.mybatis.test;

import com.mybatis.controller.Louzai;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 用于测试MyBatis和Spring的集成
public class SpringMyBatisTest {
    public static void main(String[] args) throws Exception {
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        Louzai uc = (Louzai) applicationContext.getBean("louzai");
        uc.testSuccess();
    }
}