package com.sean.hyx2021.designpattern.proxy.staticproxy;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/30/2020
 */
// 代理对象TeacherProxy需要实现和被代理对象Teacher一样的接口ITeacher
public class TeacherProxy implements ITeacher {
    // 持有Teacher目标对象，通过接口依赖。
    private ITeacher teacher;

    public TeacherProxy(ITeacher teacher) {
        this.teacher = teacher;
    }

    public void teach() {
        System.out.println("TeacherProxy is preparing others");
        System.out.println("TeacherProxy's teach()...");
        teacher.teach();//这里调用被代理对象的目标方法,前后可以做一些代理对象额外的事情
        System.out.println("TeacherProxy will process other things ...");

    }
}
