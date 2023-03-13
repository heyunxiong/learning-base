package com.sean.hyx2021.designpattern.decorator;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */

public class LongBlack extends Coffee {

    public LongBlack() {
        setDes("Long Black");
        setPrice(5.0f); //调用了父类的setPrice
    }
}
