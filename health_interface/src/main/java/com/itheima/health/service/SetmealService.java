package com.itheima.health.service;

import com.itheima.health.pojo.Setmeal;

/**
 * @Author ysl
 * @Date 2020/3/16 20:36
 * @Description: 体检套餐服务接口
 **/
public interface SetmealService {

    /**
     * 新增套餐
     * @param setmeal
     * @param checkgroupIds
     */
    void add(Setmeal setmeal, Integer[] checkgroupIds);
}
