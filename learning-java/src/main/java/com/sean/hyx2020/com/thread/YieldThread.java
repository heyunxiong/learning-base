package com.sean.hyx2020.com.thread;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 5/1/2020
 */
public class YieldThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 线程开始");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + " 线程结束");
    }

    public static void main(String[] args) {
        YieldThread yieldThread = new YieldThread();

        Thread thread1 = new Thread(yieldThread,"t1");
        Thread thread2 = new Thread(yieldThread,"t2");
        thread1.start();
        thread2.start();
    }
}
