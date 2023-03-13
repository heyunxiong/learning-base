package com.sean.hyx2021.com.sean.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/26/2020
 */
public class JavaDateTest {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        //new Date().getTime() 和 System.currentTimeMillis() 是一样的
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());

        Date date1 = new Date(5000);
        System.out.println(date1);


        Date date2 = new Date(0);
        System.out.println(date2);



        //y 代表年
        //M 代表月
        //d 代表日
        //H 代表24进制的小时
        //h 代表12进制的小时
        //m 代表分钟
        //s 代表秒
        //S 代表毫秒
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
        Date d= new Date();
        String str = sdf.format(d);
        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出: "+str);


    }

}
