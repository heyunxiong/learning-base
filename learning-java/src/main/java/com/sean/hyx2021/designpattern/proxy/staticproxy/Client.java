package com.sean.hyx2021.designpattern.proxy.staticproxy;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/30/2020
 */
public class Client {
    public static void main(String[] args) {
        //目标对象，被代理对象
        Teacher teacher = new Teacher();
        //代理对象
        TeacherProxy teacherProxy = new TeacherProxy(teacher);
        //通过代理对象的teach方法来调用目标对象的目标方法teach
        teacherProxy.teach();
    }
}
