package com.sean.hyx2020.hyx.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 8/27/2020
 */
public class MyCallableTest {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5 ; i++) {
            MyCallable myCallable = new MyCallable("线程:" + i);
            Future submit = executorService.submit(myCallable);
            try {
                System.out.println(submit.get().toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();

    }
}
