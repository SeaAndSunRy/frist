package com.bjpowernode.settings.user.test;

import com.bjpowernode.crm.util.MD5Util;

/**
 * Author.ry
 * 2019/6/28
 */
public class Test01 {
    public static void main(String[] args) {
//        String str = "YmjBjpower@163.com";
//        str = MD5Util.getMD5(str);
//
//        System.out.println(str);

        //验证失效时间
        /*String expireTime = "2018-10-10 10:10:10";
        String currentTime = DateTimeUtil.getSysTime();
        int count = expireTime.compareTo(currentTime);
        System.out.println(count);*/

        //验证锁定状态
        String lockState = "0";
        if("0".equals(lockState)){

            System.out.println("账号已锁定");

        }


        //验证ip地址
//        String ip = "192.168.1.6";
//        String allowIps = "192.168.1.1,192.168.1.2,192.168.1.3";
//        if(!allowIps.contains(ip)){
//
//            System.out.println("ip地址无效");
//
//        }


    }
}
