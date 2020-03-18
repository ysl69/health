package com.itheima.health.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.health.pojo.OrderSetting;

import java.util.List;

/**
 * @Author ysl
 * @Date 2020/3/18 15:04
 * @Description: 预约设置服务接口
 **/
@Service
public interface OrderSettingService {


    /**
     * excel文件上传，保存数据
     * @param orderSettingList
     */
    void add(List<OrderSetting> orderSettingList);
}
