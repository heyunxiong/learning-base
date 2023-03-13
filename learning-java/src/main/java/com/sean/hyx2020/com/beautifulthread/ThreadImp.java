package com.sean.hyx2020.com.beautifulthread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/23/2020
 */
public class ThreadImp {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        thread1.start();
        thread2.start();

        FutureTask<String> myCallableFutureTask = new FutureTask<>(new MyCallable());
        Thread thread3 = new Thread(myCallableFutureTask);
        thread3.start();
        String result = null;
        try {

            result = myCallableFutureTask.get();
            System.out.println(result);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
