package com.sean.hyx2020.com.thread;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 5/1/2020
 */
public class JoinThread implements  Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

        System.out.println("JoinThread: 我来插队了， 我要打十个！ 我打完了你们才能玩" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinThread joinThread = new JoinThread();
        Thread thread = new Thread(joinThread);
        thread.start();

        //
        for (int i = 0; i < 20; i++) {
            // 当i等于10的时候，开始插队 join
            if (i == 10) {
                thread.join();
            }
            System.out.println("Main 线程：" + i);
        }
    }
}
