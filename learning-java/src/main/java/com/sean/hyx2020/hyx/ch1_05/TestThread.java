package com.sean.hyx2020.hyx.ch1_05;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 8/22/2020
 */
public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();

        MyThread t1 = new MyThread(myThread);
        MyThread t2 = new MyThread(myThread);
        MyThread t3 = new MyThread(myThread);
        MyThread t4 = new MyThread(myThread);
        MyThread t5 = new MyThread(myThread);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
