package com.itheima;

import com.itheima.health.utils.SMSUtils;

/**
 * @Author ysl
 * @Date 2020/3/19 19:04
 * @Description:
 **/


public class SmsMain {
    public static void main(String[] args) throws Exception{
        SMSUtils.sendShortMessage("SMS_169899968","18722089939","1234");
    }
}
