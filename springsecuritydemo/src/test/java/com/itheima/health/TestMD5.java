package com.itheima.health;

import com.itheima.health.utils.MD5Utils;
import org.junit.Test;

/**
 * @Author ysl
 * @Date 2020/3/21 18:26
 * @Description:
 **/


public class TestMD5 {

    @Test
    public void testMD5(){
        System.out.println(MD5Utils.md5("1234xiaowang"));

        System.out.println(MD5Utils.md5("1234xiaoli"));

    }
}
