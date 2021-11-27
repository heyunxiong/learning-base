package hyx2021.designpattern.visitor;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */

// 双分派？？

import hyx2021.designpattern.visitor.Action;
import hyx2021.designpattern.visitor.Person;

/**
 * /1.这里我们使用到了双分派，即首先在客户端程序中，将具体状态作为参数传递 woman中（第一次分派）
 * 2.然后 Woman类调用作为参数的"具体方法”中方法 getwomanResu1t，同时将自己（this）作为参数传入，完成了第二次分派
 */
public class Woman extends Person {
    @Override
    void accept(Action action) {
        action.getWomanResult(this);
    }
}
