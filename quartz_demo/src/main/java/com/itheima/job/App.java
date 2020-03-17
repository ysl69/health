package com.itheima.job;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ysl
 * @Date 2020/3/17 18:57
 * @Description:
 **/


public class App {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("application-jobs.xml");
    }
}
