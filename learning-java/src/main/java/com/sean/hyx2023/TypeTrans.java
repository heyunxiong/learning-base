package com.sean.hyx2023;

/**
 * Author: Sean He
 * Date: 2023/3/13
 */
public class TypeTrans {
    public static void main(String[] args) {
//        testTypeTrans();
//        testTypeTrans2();
        test();
    }

    public static void testTypeTrans(){
        int int_1 = 123456789;
        float float_1 = int_1;
        System.out.println(float_1);
        System.out.println(int_1 + float_1);

    }
    public static void testTypeTrans2(){
        double d1=13.9D;
        int i1 = (int)d1;//截断操作
        System.out.println(i1);

        long l1=123456L;
        short s2=(short)l1;
        System.out.println(s2);
    }

    public static void test(){
        int i = 1;
        int j = i++; // i先赋值给j，j=1，然后i自身加1，i=2
        int n = 2;
        int m = ++n; // n自身先加1，n=3，然后赋值给m m=3;
        System.out.println("i :"+ i);
        System.out.println("j :"+ j);
        System.out.println("n :"+ n);
        System.out.println("m :"+ m);
    }
}
