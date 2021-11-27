package hyx2020.hyx.test;

import java.util.concurrent.Callable;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 8/27/2020
 */
public class MyCallable implements Callable {

    private String name;

    public MyCallable(String name) {
        this.name = name;
    }


    public Object call() throws Exception {
        return name;
    }
}
