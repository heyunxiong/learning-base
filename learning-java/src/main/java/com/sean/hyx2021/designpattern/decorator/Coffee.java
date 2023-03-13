package com.sean.hyx2021.designpattern.decorator;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */

//coffee类作为各种咖啡类别的父类，中间缓冲的作用
public class Coffee extends Drink{

    @Override
    public float cost() {
        // 这里直接表示该种类咖啡的价格
        return super.getPrice();
    }
}
