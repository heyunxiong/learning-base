package hyx2021.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/30/2020
 */

//这里不需要实现任何接口了
public class ProxyFactory {
    //目标对象
    private Object teacher;

    public ProxyFactory(Object teacher) {
        this.teacher = teacher;
    }
    public Object getInstance(){
        //ClassLoader loader,指定当前目标对象Teacher使用的类加载器
        //Class<?>[] interfaces, 目标对象所实现的接口类型ITeacher
        //InvocationHandler h 事件处理，执行目标对象的方法
        // newProxyInstance是重点
        return Proxy.newProxyInstance(
                teacher.getClass().getClassLoader(),
                teacher.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //
                        System.out.println("JDK proxy starting");
                        //反射机制调用目标对象的方法，这里的method就是目标方法teach,sayHello, args会保存传入的参数
                        Object invokeTeacher = method.invoke(teacher,args);
                        System.out.println("Teacher的方法被invoke了");
                        return invokeTeacher;
                    }
                });
    }

}
