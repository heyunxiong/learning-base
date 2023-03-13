package com.sean.hyx2021.designpattern.decorator;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
//继承了Coffe，表明Espresso和价格
public class Espresso extends Coffee {

    public Espresso() {
        setDes("Espresso Coffee");
        setPrice(6.0f); //这里是用了爷爷类，Drink里面的setPrice
    }
}
