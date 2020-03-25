package com.itheima.health.service;

import java.util.Map;

/**
 * @Author ysl
 * @Date 2020/3/25 18:40
 * @Description:
 **/
public interface ReportService {


    /**
     * 获取运营统计数据
     Map数据格式：
     *      todayNewMember（今日新增会员数） -> number
     *      totalMember（总会员数） -> number
     *      thisWeekNewMember（本周新增会员数） -> number
     *      thisMonthNewMember（本月新增会员数） -> number
     *      todayOrderNumber（今日预约数） -> number
     *      todayVisitsNumber（今日到诊数） -> number
     *      thisWeekOrderNumber（本周预约数） -> number
     *      thisWeekVisitsNumber（本周到诊数） -> number
     *      thisMonthOrderNumber（本月预约数） -> number
     *      thisMonthVisitsNumber（本月到诊数） -> number
     *      hotSetmeal（热门套餐（取前4）） -> List<Setmeal>
     */
    Map<String, Object> getBusinessReport() throws Exception;

}
