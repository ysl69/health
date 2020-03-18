package com.itheima.health.dao;

import com.itheima.health.pojo.OrderSetting;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @Author ysl
 * @Date 2020/3/18 15:12
 * @Description:
 **/

@Repository
public interface OrderSettingDao {

    /**
     * 检查数据(日期)是否存在
     * @param orderDate
     * @return
     */
    long findCountByOrderDate(Date orderDate);


    /**
     * 更新
     * @param orderSetting
     */
    void editNumberByOrderDate(OrderSetting orderSetting);


    /**
     * 添加
     * @param orderSetting
     */
    void add(OrderSetting orderSetting);
}
