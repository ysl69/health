package com.itheima.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.health.constant.MessageConstant;
import com.itheima.health.entity.Result;
import com.itheima.health.pojo.OrderSetting;
import com.itheima.health.service.OrderSettingService;
import com.itheima.health.utils.POIUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author ysl
 * @Date 2020/3/18 14:55
 * @Description: 预约设置
 **/

@RestController
@RequestMapping("/ordersetting")
public class OrderSettingController {


    @Reference
    private OrderSettingService orderSettingService;


    /**
     * Excel文件上传，并解析文件内容保存到数据库
     * @param excelFile
     * @return
     */
    @RequestMapping("/upload")
    public Result upload(@RequestParam(value = "excelFile") MultipartFile excelFile){
        try {
            //读取excel文件数据
            List<String[]> list = POIUtils.readExcel(excelFile);
            if (list != null && list.size() >0){
                List<OrderSetting> orderSettingList = new ArrayList<>();
                for (String[] strings : list) {
                    OrderSetting orderSetting = new OrderSetting(new Date(strings[0]),
                            Integer.parseInt(strings[1]));
                    orderSettingList.add(orderSetting);
                }
                orderSettingService.add(orderSettingList);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.IMPORT_ORDERSETTING_FAIL);
        }
        return new Result(true,MessageConstant.IMPORT_ORDERSETTING_SUCCESS);
    }
}
