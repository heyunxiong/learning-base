package com.sean.hyx2020.com.beautifulthread;

import java.util.concurrent.Callable;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/23/2020
 */
public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        return "This is MyCallable";
    }
}
