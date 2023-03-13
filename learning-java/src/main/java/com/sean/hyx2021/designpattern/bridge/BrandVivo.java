package com.sean.hyx2021.designpattern.bridge;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class BrandVivo implements Brand {
    @Override
    public void call() {
        System.out.println("vivo's call() ");
    }

    @Override
    public void close() {
        System.out.println("vivo's close() ");
    }

    @Override
    public void open() {
        System.out.println("vivo's open() ");
    }
}
