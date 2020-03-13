package com.itheima.health.dao;

import com.itheima.health.pojo.CheckItem;
import org.springframework.stereotype.Repository;

/**
 * @Author ysl
 * @Date 2020/3/11 21:29
 * @Description: 持久层Dao接口
 **/

@Repository
public interface CheckItemDao {


    public void add(CheckItem checkItem);
}
