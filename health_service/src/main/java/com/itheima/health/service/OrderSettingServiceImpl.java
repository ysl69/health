package com.itheima.health.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.health.dao.OrderSettingDao;
import com.itheima.health.pojo.OrderSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author ysl
 * @Date 2020/3/18 15:06
 * @Description: 预约设置
 **/

@Service(interfaceClass = OrderSettingService.class)
@Transactional
public class OrderSettingServiceImpl implements OrderSettingService{



    @Autowired
    private OrderSettingDao orderSettingDao;


    /**
     * excel上传，保存数据,批量添加
     * @param orderSettingList
     */
    @Override
    public void add(List<OrderSetting> orderSettingList) {
        if (orderSettingList != null && orderSettingList.size() > 0){
            for (OrderSetting orderSetting : orderSettingList) {
                //检查此数据(日期)是否存在
                long count = orderSettingDao.findCountByOrderDate(orderSetting.getOrderDate());
                if (count > 0){
                    //已经存在，执行更新操作
                    orderSettingDao.editNumberByOrderDate(orderSetting);
                }else {
                    //不存在，执行添加操作
                    orderSettingDao.add(orderSetting);
                }
            }
        }
    }
}

