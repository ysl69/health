package com.itheima.health.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.health.pojo.CheckItem;

/**
 * @Author ysl
 * @Date 2020/3/11 21:25
 * @Description:
 **/

@Service
public interface CheckItemService {
    /**
     * 检查项服务接口
     * @param checkItem
     */
    void add(CheckItem checkItem);

}
