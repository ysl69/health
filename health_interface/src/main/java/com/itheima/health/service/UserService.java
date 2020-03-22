package com.itheima.health.service;

import com.itheima.health.pojo.User;

/**
 * @Author ysl
 * @Date 2020/3/21 21:39
 * @Description:   用户服务接口
 **/
public interface UserService {

    User findUSerByUsername(String username);
}
