package com.sean.hyx2021.designpattern.singleton.type5;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);

    }
}
class Singleton{
    // 1.私有化构造器
    private Singleton(){}

    // 2.静态变量instance
    private static Singleton instance = null;

    // 3.提供一个静态的共有方法，使用到该方法才创建Instance
    public static Singleton getInstance() {
        //判断是否存在instance实例
        if (instance == null){
            //使用synchronized，划分锁的粒度
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}