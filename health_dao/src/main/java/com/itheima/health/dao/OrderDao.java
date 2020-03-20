package com.itheima.health.dao;

import com.itheima.health.pojo.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

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
}
