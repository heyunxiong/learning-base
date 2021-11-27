package hyx2020.com.design;

import java.lang.reflect.Constructor;

// 单例模式 - 饿汉模式  使用静态内部类实现  //但是看着代码又有点像是懒汉模式emmm？ 先不管分类，知道有这种方法即可，而且这种方法容易被万恶的反射破解
public class HungrySingletonIC {
    //1.私有化构造方法
    private HungrySingletonIC() {
    }

    //2.使用静态内部类创建唯一不可修改实例
    private static class InnerCLass {
        //4.在内部类创建
        private static final HungrySingletonIC instance = new HungrySingletonIC();
    }

    //3.通过提供公用方法给外界，返回内部类创建的实例
    public static HungrySingletonIC getInstance() {
        return InnerCLass.instance;
    }
}

class HungrySingletonICTest {
    public static void main(String[] args) throws Exception {
        HungrySingletonIC instance = HungrySingletonIC.getInstance();
        HungrySingletonIC instance2 = HungrySingletonIC.getInstance();

        System.out.println(instance == instance2);
        // 通过反射破坏单例
        Constructor<HungrySingletonIC> declaredConstructor = HungrySingletonIC.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true); // 修改了构造器private的作用 private HungrySingletonIC(){}，使得其失效。
        //通过反射创建实例
        HungrySingletonIC hungrySingletonIC = declaredConstructor.newInstance();
        HungrySingletonIC hungrySingletonIC2 = declaredConstructor.newInstance();
        //此时为false，创建了两个不同的实例
        System.out.println(hungrySingletonIC == hungrySingletonIC2);

        //原本正常创建的对象和通过反射创建的对象也是不一样的
        System.out.println(instance == hungrySingletonIC);
    }
}