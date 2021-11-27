package hyx2021.designpattern.proxy.dynamicproxy;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/30/2020
 */
public class Client {
    public static void main(String[] args) {
        //目标对象，被代理对象
        ITeacher teacher = new Teacher();
        //给目标对象进行代理
        ITeacher proxyInstance = (ITeacher)new ProxyFactory(teacher).getInstance();
        //System.out.println("proxyInstance===>"+proxyInstance);
        //class com.sun.proxy.$Proxy0 动态创建代理对象
        //System.out.println("proxyInstance===>"+proxyInstance.getClass());
        proxyInstance.teach();
        proxyInstance.sayHello("tom");
    }
}
