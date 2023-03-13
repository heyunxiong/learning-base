package com.sean.hyx2020.com.beautifulthread;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/23/2020
 */
public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                /*while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread() + "hello");
                }*/
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
        Thread.sleep(1000);
        System.out.println("main thread interrupt thread");
        thread.interrupt();
        thread.join();

        System.out.println("main is over");
    }
}
