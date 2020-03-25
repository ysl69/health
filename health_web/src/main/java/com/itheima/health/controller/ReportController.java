package com.itheima.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.health.constant.MessageConstant;
import com.itheima.health.entity.Result;
import com.itheima.health.service.MemberService;
import com.itheima.health.service.SetmealService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author ysl
 * @Date 2020/3/22 15:01
 * @Description: 统计报表
 **/

@RestController
@RequestMapping("/report")
public class ReportController {

    @Reference
    private MemberService memberService;


    @Reference
    private SetmealService setmealService;


    /**
     * 会员数量统计
     * @return
     */
    @RequestMapping("/getMemberReport")
    public Result getMemberReport(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(calendar.MONTH,-12);//获得当前日期之前12个月的日期

        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 12; i++) {
            calendar.add(Calendar.MONTH,1);
            list.add(new SimpleDateFormat("yyyy-MM").format(calendar.getTime()));
        }

        Map<String, Object> map = new HashMap<String,Object>();
        map.put("months",list);

        List<Integer> memberCount = memberService.findMemberCountByMonth(list);
        map.put("memberCount",memberCount);

        return new Result(true, MessageConstant.GET_MEMBER_NUMBER_REPORT_SUCCESS,map);
    }


    /**
     * 套餐占比统计
     * @return
     */
    @RequestMapping("/getSetmealReport")
    public Result getSetmealReport(){
        List<Map<String,Object>> list = setmealService.findSetmealCount();

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("setmealCount",list);

        List<String> setmealNames = new ArrayList<String>();
        for (Map<String, Object> m : list) {
            String name = (String) m.get("name");
            setmealNames.add(name);
        }

        map.put("setmealNames",setmealNames);

        return new Result(true,MessageConstant.GET_SETMEAL_COUNT_REPORT_SUCCESS,map);
    }
}
