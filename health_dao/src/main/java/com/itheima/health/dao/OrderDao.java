package com.itheima.health.dao;

import com.itheima.health.pojo.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author ysl
 * @Date 2020/3/20 17:00
 * @Description:
 **/

@Repository
public interface OrderDao {

    /**
     *
     * @param order
     * @return
     */
    List<Order> findByCondition(Order order);


    /**
     * 新增
     * @param order
     */
    void add(Order order);


    /**
     *  根据id查询预约信息，包括套餐信息和会员信息
     * @param id
     * @return
     */
    Map findById4Detail(Integer id);


    /**
     * 今日预约数
     * @param today
     * @return
     */
    Integer findOrderCountByDate(String today);

    /**
     * 本周预约数
     * @param weekMap
     * @return
     */
    Integer findOrderCountBetweenDate(Map<String, Object> weekMap);


    /**
     * 今日到诊数
     * @param today
     * @return
     */
    Integer findVisitsCountByDate(String today);


    /**
     * 本周到诊数
     * @param thisWeekMonday
     * @return
     */
    Integer findVisitsCountAfterDate(String thisWeekMonday);


    /**
     * 热门套餐（取前4）
     * @return
     */
    List<Map> findHotSetmeal();
}
