package com.sean.hyx2021.designpattern.singleton;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class Singleton {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        // return true
        System.out.println(instance == instance2);
        // same hashcode
        System.out.println("instance.hashCode:"+instance.hashCode());
        System.out.println("instance2.hashCode:"+instance2.hashCode());
    }
}

/** 饿汉模式
 */
class HungrySingleton{
    // 1.私有化构造器
    private HungrySingleton(){}

    // 2.类内创建该类对象
    private final static HungrySingleton instance =new HungrySingleton();

    // 3.暴露一个获取实例的静态方法
    public static HungrySingleton getInstance() {
        return instance;
    }
}
