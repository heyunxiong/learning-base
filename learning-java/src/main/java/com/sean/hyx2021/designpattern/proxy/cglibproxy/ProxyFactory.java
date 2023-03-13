package com.sean.hyx2021.designpattern.proxy.cglibproxy;/*
package designpattern.proxy.cglibproxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

*/
/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/30/2020
 *//*

public class ProxyFactory implements MethodInterceptor {
    //维护一个目标对象
    private Object teacher;

    public ProxyFactory(Object target) {
        this.teacher = target;
    }


    //返回一个代理对象
    public Object getProxyInstance(){
        //1.cglib下的一个工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类，设置目标对象为父类
        enhancer.setSuperclass(teacher.getClass());
        //3.设置回调函数？ 为什么要设置回调函数？
        enhancer.setCallback(this);
        //4.使用enhance创建子类对象，即代理对象
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
            throws Throwable {

        Object obj = method.invoke(teacher, objects);

        return obj;
    }

}
*/
