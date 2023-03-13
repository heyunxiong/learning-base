package com.sean.hyx2021.designpattern.bridge;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
// 
public class UprightPhone extends Phone{

    public UprightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("UprightPhone  is open....");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("UprightPhone is close....");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("UprightPhone is call....");
    }
}
