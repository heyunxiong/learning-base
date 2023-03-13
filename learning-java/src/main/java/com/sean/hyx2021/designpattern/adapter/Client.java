package com.sean.hyx2021.designpattern.adapter;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("====类适配器====");
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter());
        System.out.println("====对象适配器====");
        Phone phone2 = new Phone();
        phone2.charge(new VoltageAdapter2(new Voltage220V()));
    }
}
