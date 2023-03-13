package com.sean.hyx2021.designpattern.bridge;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }

    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }


}
