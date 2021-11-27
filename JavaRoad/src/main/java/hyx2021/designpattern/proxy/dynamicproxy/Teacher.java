package hyx2021.designpattern.proxy.dynamicproxy;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/30/2020
 */
// 被代理对象（目标对象）Teacher 需要实现ITeacher接口
public class Teacher implements ITeacher {

    @Override
    public void teach() {
        System.out.println("Teacher's teach().....");
    }

    @Override
    public void sayHello(String str) {
        System.out.println("hi~~"+str);
    }
}
