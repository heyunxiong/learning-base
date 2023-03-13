package com.sean.hyx2021.designpattern.visitor;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public abstract class Person {

    abstract void accept(Action action);

}
