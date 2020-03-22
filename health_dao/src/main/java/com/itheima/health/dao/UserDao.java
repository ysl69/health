package com.itheima.health.dao;

import com.itheima.health.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @Author ysl
 * @Date 2020/3/21 21:46
 * @Description:
 **/

@Repository
public interface UserDao {


    User findUserByUsername(String username);
}
