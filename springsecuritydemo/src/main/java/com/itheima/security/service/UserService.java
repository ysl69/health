package com.itheima.security.service;

import com.itheima.health.pojo.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ysl
 * @Date 2020/3/23 18:34
 * @Description:
 **/

@Component
public class UserService implements UserDetailsService {


    public static BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    //模拟数据库中的用户数据
    public static Map<String,com.itheima.health.pojo.User> map = new HashMap<String, User>();

    static {
        com.itheima.health.pojo.User user1 = new com.itheima.health.pojo.User();
        user1.setUsername("admin");
        user1.setPassword(passwordEncoder.encode("admin"));

        com.itheima.health.pojo.User user2 = new com.itheima.health.pojo.User();
        user2.setUsername("zhangsan");
        user2.setPassword(passwordEncoder.encode("123"));

        map.put(user1.getUsername(), user1);
        map.put(user2.getUsername(), user2);
    }



    /**
     * 根据用户名加载用户信息
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username:"+username);
        com.itheima.health.pojo.User userInDb = map.get(username); //根据模拟用户名查询数据库
        if (userInDb == null){
            //根据用户名没有查询到用户
            return null;
        }

        //模拟数据库中的密码，后期需要查询数据库
        //String passwordInDb = "{noop}" + userInDb.getPassword();
        String passwordInDb = userInDb.getPassword();

        List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
        //授权，后期需要改为查询数据库动态获得用户拥有的权限和角色
        list.add(new SimpleGrantedAuthority("add"));
        list.add(new SimpleGrantedAuthority("delete"));
        list.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

        UserDetails user = new org.springframework.security.core.userdetails.User(username,passwordInDb,list);
        return user;
    }
}
