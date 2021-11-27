package hyx2020.com.design;

//单例模式 - 饿汉单例模式
public class HungrySingleton {
    // 1.私有化构造方法 - 不允许外部通过new创建实例
    private HungrySingleton() {
    }

    // 2. 创建唯一实例，类加载中便已经创建好对象，不管此对象是否使用。
    private static HungrySingleton instance = new HungrySingleton();

    // 3. 外部通过getInstance()方法获取唯一实例
    public static HungrySingleton getInstance() {
        return instance;
    }
}

class HungrySingletonTest {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance == instance2);
    }
}