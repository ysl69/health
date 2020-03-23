package com.test;

import com.itheima.health.utils.MD5Utils;
import org.junit.Test;

/**
 * @Author ysl
 * @Date 2020/3/23 19:06
 * @Description:
 **/


public class testMD5 {

    @Test
    public void testMD5() {
        // 密码同样是1234却变成了密码不相同
        System.out.println(MD5Utils.md5("1234xiaowang")); //a8231077b3d5b40ffadee7f4c8f66cb7
        System.out.println(MD5Utils.md5("1234xiaoli")); //7d5250d8620fcdb53b25f96a1c7be591
    }
}
