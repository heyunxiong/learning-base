package com.sean.hyx2021.com.sean.thread;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 2021-04-22
 */
public class MyThread implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("实现Runnable接口");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("==> Start Main ");
        new Thread(new MyThread()).start();
        System.out.println("==> End Main ");
    }
}
