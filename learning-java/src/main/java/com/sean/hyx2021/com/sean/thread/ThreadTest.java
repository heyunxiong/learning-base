package com.sean.hyx2021.com.sean.thread;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/15/2021
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        //创建线程，把实现Runnable接口的类扔进去
        new Thread(myThread).start();

        System.out.println("这是主线程");
    }
}
