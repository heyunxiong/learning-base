package com.sean.hyx2021.designpattern.singleton.type4;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}
class Singleton{
    // 1.私有化构造器
    private Singleton(){}

    // 2.静态变量instance
    private static Singleton instance = null;

    // 3.提供一个静态的共有方法，使用到该方法才创建Instance,添加synchronized解决线程安全问题
    public static synchronized Singleton getInstance() {
        //判断是否存在instance实例
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}