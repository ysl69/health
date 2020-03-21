package com.itheima.health.service;

import com.itheima.health.pojo.Member;

/**
 * @Author ysl
 * @Date 2020/3/21 11:21
 * @Description: 会员服务
 **/
public interface MemberService {


    Member findByTelephone(String telephone);

    void add(Member member);
}
