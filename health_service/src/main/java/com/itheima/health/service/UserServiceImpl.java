package com.itheima.health.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.health.dao.UserDao;
import com.itheima.health.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author ysl
 * @Date 2020/3/21 21:44
 * @Description:
 **/

@Service(interfaceClass = UserService.class)
@Transactional
public class UserServiceImpl implements UserService{


    @Autowired
    private UserDao userDao;


    @Override
    public User findUserByUsername(String username) {
        User user = userDao.findUserByUsername(username);
        return user;
    }
}
