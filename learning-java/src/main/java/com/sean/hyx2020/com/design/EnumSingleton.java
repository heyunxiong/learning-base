package com.sean.hyx2020.com.design;

/**
    单例模式 - 枚举单例 线程安全，调用效率高，不能延迟加载
    newInstance的一部分代码，可以看到如果是枚举类的话，就无法通过反射破坏了
        if ((clazz.getModifiers() & Modifier.ENUM) != 0)
            throw new IllegalArgumentException("Cannot reflectively create enum objects");
 * @author heyunxiong
 */
public enum EnumSingleton {
    INSTANCE;

    public EnumSingleton getInstance() {
        return INSTANCE;
    }
}

class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance == instance2);

    }
}