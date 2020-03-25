package com.itheima.health.dao;

import com.itheima.health.pojo.Member;
import org.springframework.stereotype.Repository;

/**
 * @Author ysl
 * @Date 2020/3/20 16:59
 * @Description:
 **/

@Repository
public interface MemberDao {


    /**
     *根据id查询会员
     * @param telephone
     * @return
     */
    Member findByTelephone(String telephone);


    /**
     * 新增会员
     * @param member
     */
    void add(Member member);


    /**
     * 根据月份统计会员数量
     * @param m
     * @return
     */
    Integer findMemberCountBeforeDate(String m);

    /**
     * 今日新增会员数
     * @param today
     * @return
     */
    Integer findMemberCountByDate(String today);


    /**
     * 总会员数
     * @return
     */
    Integer findMemberTotalCount();


    /**
     * 本周新增会员数
     * @param thisWeekMonday
     * @return
     */
    Integer findMemberCountAfterDate(String thisWeekMonday);
}
