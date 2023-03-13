package com.sean.hyx2021.com.sean.stream;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 2021-01-04
 */
@FunctionalInterface
public interface DefaultInterface {
    void say();

    default void speak(){
        System.out.println("speak");
    }

    static void callStatic(){
        System.out.println("this is static");

    }
}
