package com.sean.hyx2021.designpattern.singleton.type7;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);

    }
}
class Singleton{
    // 1.私有化构造器
    private Singleton(){}
    // 2. 使用内部静态类的静态属性获取Singleton实例
    private static class SingletonInstance {
        private  static final Singleton INSTANCE = new Singleton();
    }
    // 3.提供静态公有方法，返回内部类的静态属性
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}