package com.itheima.health.dao;

import com.github.pagehelper.Page;
import com.itheima.health.pojo.CheckGroup;
import com.itheima.health.pojo.CheckItem;
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


    /**
     * 分页查询
     * @param queryString
     * @return
     */
    Page<CheckItem> selectByCondition(String queryString);

}
