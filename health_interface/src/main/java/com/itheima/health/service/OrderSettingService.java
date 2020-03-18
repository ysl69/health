package com.itheima.health.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.health.pojo.OrderSetting;

import java.util.List;
import java.util.Map;

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


    /**
     *根据日期查询预约设置数据(获取指定日期所在月份的预约设置数据)
     * @param date
     * @return
     */
    List<Map> getOrderSettingByMonth(String date);//参数格式为：2019-03
}
