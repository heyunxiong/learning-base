package hyx2021.designpattern.interpreter;

import java.util.HashMap;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/3/2020
 */
// 抽象类表达式，通过hashmap 可获取变量
public abstract class Expression {
    // a+b-c
    // key就是表达式。参数【abc】，value就是具体值
    public abstract int interpreter(HashMap<String, Integer> var);
}
