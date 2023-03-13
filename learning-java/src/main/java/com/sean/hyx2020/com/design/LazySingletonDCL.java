package com.sean.hyx2020.com.design;

/**
 * @author heyunxiong
 */ // 单例模式 - 懒汉模式DCL， double check lock 双重锁优化
public class LazySingletonDCL {
    // 1.私有化构造方法 - 不允许外部通过new创建实例
    private LazySingletonDCL() {
    }

    // 2. 创建唯一实例引用，不在此时进行初始化。 另注意：加上volatile了， volatile的作用会去看内存中有没有该实例 可参考：https://www.cnblogs.com/dolphin0520/p/3920373.html
    private volatile static LazySingletonDCL instance = null;

    // 3. 外部通过getInstance()方法获取唯一实例
    // 5. synchronized的作用是避免多线程访问出现异常，效率较低，线程安全

    public static LazySingletonDCL getInstance() {
        // 4. 判断是否存在实例，当实例为null才创建
        if (instance == null) {
            // 使用代码块同步锁，进行二次验证。
            // 但是此操作不具有原子性,会出现极端的抢占资源问题线程1还没有执行完，线程2发现没有对象就又会去实行创建，故需要在声明变量的时候加上 volatile
            synchronized (LazySingletonDCL.class) {
                if (instance == null) {
                    instance = new LazySingletonDCL();
                }
            }
        }
        return instance;
    }
}

class LazySingletonDCLTest {
    public static void main(String[] args) {
        LazySingletonDCL instance = LazySingletonDCL.getInstance();
        LazySingletonDCL instance2 = LazySingletonDCL.getInstance();
        System.out.println(instance == instance2);
    }
}