package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.HelloService;

/**
 * @Author ysl
 * @Date 2020/3/10 14:50
 * @Description:
 **/

@Service
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(String name) {
        System.out.println("服务的sayHello方法被调用！");
        return "hello " + name;
    }
}
