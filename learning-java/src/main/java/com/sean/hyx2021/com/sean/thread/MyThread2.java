package com.sean.hyx2021.com.sean.thread;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/15/2021
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("继承Thread方法，创建线程");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("==> Start Main ");
        new MyThread2().start();
        System.out.println("==> End Main ");
    }
}
