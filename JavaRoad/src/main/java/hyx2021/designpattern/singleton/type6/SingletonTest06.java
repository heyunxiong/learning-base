package hyx2021.designpattern.singleton.type6;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);


    }
}
class Singleton{
    // 1.私有化构造器
    private Singleton(){}

    // 2.静态变量instance，需要使用volatile修饰，实现内存可见
    private static volatile Singleton instance = null;

    // 3.提供一个静态的共有方法，使用到该方法才创建Instance,双重锁
    public static Singleton getInstance() {
        //判断是否存在instance实例
        if (instance == null){
            //使用synchronized，划分锁的粒度
            synchronized (Singleton.class){
                // 首次调用进来创建的时候，防止多线程创建多个对象
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}