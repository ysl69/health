package com.itheima.health.service;

import com.itheima.health.pojo.CheckGroup;

/**
 * @Author ysl
 * @Date 2020/3/15 20:01
 * @Description: 检查组
 **/
public interface CheckGroupService {

    /**
     * 新增
     * @param checkGroup
     * @param checkitemIds
     */
    void add(CheckGroup checkGroup, Integer[] checkitemIds);
}
