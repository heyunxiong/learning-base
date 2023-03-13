package com.sean.hyx2020.hyx.ch1_05;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 8/22/2020
 */
public class MyThread extends Thread {
    private int count = 5;

    @Override
    public void run() {
        super.run();
            count--;
            System.out.println("线程名：" + this.currentThread().getName() + "  count = " + count);

    }

    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread() {
        super();
    }
}
