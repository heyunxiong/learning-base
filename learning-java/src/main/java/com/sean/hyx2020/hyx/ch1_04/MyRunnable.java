package com.sean.hyx2020.hyx.ch1_04;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 8/21/2020
 */
public class MyRunnable implements Runnable {

    public void run() {
        System.out.println("实现Runnable接口创建线程=====>" + Thread.currentThread().getName());
    }
}
