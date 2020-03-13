package com.itheima.health.dao;

import com.github.pagehelper.Page;
import com.itheima.health.pojo.CheckItem;
import org.springframework.stereotype.Repository;

/**
 * @Author ysl
 * @Date 2020/3/11 21:29
 * @Description: 持久层Dao接口
 **/

@Repository
public interface CheckItemDao {


    /**
     * 添加检查项
     * @param checkItem
     */
    public void add(CheckItem checkItem);


    /**
     * 分页
     * @param queryString
     * @return
     */
    Page<CheckItem> selectByCondition(String queryString);
}
