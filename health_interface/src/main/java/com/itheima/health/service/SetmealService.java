package com.itheima.health.service;

import com.itheima.health.entity.PageResult;
import com.itheima.health.pojo.Setmeal;

import java.util.List;

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


    /**
     * 分页查询
     * @param currentPage
     * @param pageSize
     * @param queryString
     * @return
     */
    PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);


    /**
     * 查询所有套餐信息
     * @return
     */
    List<Setmeal> findAll();
}
