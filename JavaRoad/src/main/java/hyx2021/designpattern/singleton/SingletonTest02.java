package hyx2021.designpattern.singleton;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton02 instance = Singleton02.getInstance();
        Singleton02 instance2 = Singleton02.getInstance();
        System.out.println(instance == instance2);
    }
}

class Singleton02{
    // 1.私有化构造器
    private Singleton02(){}

    // 2.类内创建该类对象
    private static Singleton02 instance = null;
    // 使用静态代码块里面创建对象
    static {
        instance = new Singleton02();
    }
    // 3.暴露一个获取实例的静态方法
     public static Singleton02 getInstance() {
         return instance;
     }

}
