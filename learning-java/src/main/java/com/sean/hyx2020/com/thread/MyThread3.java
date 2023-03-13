package com.sean.hyx2020.com.thread;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 5/1/2020
 */
public class MyThread3 implements Runnable {

    private int ticket = 10;

    @Override
    public void run() {
        while(true){
            if (ticket <= 0){
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "--买到了第" + ticket-- + "张票");
        }

    }

    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        // 一个对象，三个线程；单对象多个资源
        new Thread(myThread3,"Jack").start();
        new Thread(myThread3,"Tom").start();
        new Thread(myThread3,"Geoge").start();

    }
}
