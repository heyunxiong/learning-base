package com.sean.hyx2021.designpattern.singleton.type8;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);

    }
}

enum Singleton{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok~");
    }
}