package com.itheima.health.service;

import com.itheima.health.entity.Result;

import java.util.Map;

/**
 * @Author ysl
 * @Date 2020/3/20 13:24
 * @Description: 体检预约服务接口
 **/
public interface OrderService {

    Result order(Map map) throws Exception;


    /**
     * 根据id查询预约信息，包括套餐信息和会员信息
     * @param id
     * @return
     */
    Result findById4Detail(Integer id) throws Exception;
}
