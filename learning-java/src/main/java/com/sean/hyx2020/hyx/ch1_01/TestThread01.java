package com.sean.hyx2020.hyx.ch1_01;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 8/21/2020
 */
public class TestThread01 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName() + " 运行结束");
    }
}
