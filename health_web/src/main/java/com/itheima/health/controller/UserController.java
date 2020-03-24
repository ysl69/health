package com.itheima.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.health.constant.MessageConstant;
import com.itheima.health.entity.Result;
import com.itheima.health.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ysl
 * @Date 2020/3/21 22:15
 * @Description:
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;


    /**
     * 获取当前登录用户的用户名
     * @return
     */
    @RequestMapping("/getUsername")
    public Result getUsername(){


        try {
            org.springframework.security.core.userdetails.User user =
                    (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            return new Result(true, MessageConstant.GET_USERNAME_SUCCESS,user.getUsername());
        } catch (Exception e) {
            return new Result(false,MessageConstant.GET_USERNAME_FAIL);
        }
    }
}
