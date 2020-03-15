package com.itheima.health.dao;

import com.itheima.health.pojo.CheckGroup;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @Author ysl
 * @Date 2020/3/15 21:34
 * @Description:
 **/

@Repository
public interface CheckGroupDao {

    /**
     * 新增
     * @param checkGroup
     */
    void add(CheckGroup checkGroup);


    /**
     * 设置检查组合和检查项的关联关系
     * @param map
     */
    void setCheckGroupAndCheckItem(Map<String, Integer> map);
}
