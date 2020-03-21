package com.itheima.health;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author ysl
 * @Date 2020/3/21 18:29
 * @Description:
 **/


public class TestSpringSecurity {


    @Test
    public void testSpringSecurity(){
        //$2a$10$A3HXRV55zsfqvtQ9QAPre.4PT7WPRxDlPSpeQl11TrWxC0xUfzlcK
        //$2a$10$Pvqi9SbXfJWmkfo0V9RGBO0ROsdqLG2RfrgI4dJyTjEi6KSTGcOhq
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String s = encoder.encode("abc");
        System.out.println(s);
        String s1 = encoder.encode("abc");
        System.out.println(s1);


        //进行判断
        boolean b = encoder.matches("abc", "$2a$10$A3HXRV55zsfqvtQ9QAPre.4PT7WPRxDlPSpeQl11TrWxC0xUfzlcK");
        System.out.println(b);
    }
}
