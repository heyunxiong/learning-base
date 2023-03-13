package com.sean.hyx2021.designpattern.builder;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
