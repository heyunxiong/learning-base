package hyx2020.com.design;

// 单例模式 - 懒汉模式
public class LazySingleton {
    // 1.私有化构造方法 - 不允许外部通过new创建实例
    private LazySingleton() {
    }

    // 2. 创建唯一实例引用，不在此时进行初始化。
    private static LazySingleton instance = null;

    // 3. 外部通过getInstance()方法获取唯一实例
    // 5. synchronized的作用是避免多线程访问出现异常，效率较低，线程安全
    public static synchronized LazySingleton getInstance() {
        // 4. 判断是否存在实例，当实例为null才创建
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

class LazySingletonTest {
    public static void main(String[] args) {
        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance == instance2);
    }
}