package com.itheima.health.service;

import com.itheima.health.pojo.Member;

import java.util.List;

/**
 * @Author ysl
 * @Date 2020/3/21 11:21
 * @Description: 会员服务
 **/
public interface MemberService {


    Member findByTelephone(String telephone);

    void add(Member member);

    /**
     * 根据月份统计会员数量
     * @param list
     * @return
     */
    List<Integer> findMemberCountByMonth(List<String> list);
}
