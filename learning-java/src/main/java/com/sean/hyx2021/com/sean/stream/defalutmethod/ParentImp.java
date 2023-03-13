package com.sean.hyx2021.com.sean.stream.defalutmethod;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/29/2020
 */
public class ParentImp implements Parent {
    @Override
    public void message(String body) {
        System.out.println("this is for body");
    }

    @Override
    public String getLastMessage() {
        return null;
    }
}
