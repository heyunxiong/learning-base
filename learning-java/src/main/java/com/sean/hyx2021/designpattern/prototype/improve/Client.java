package com.sean.hyx2021.designpattern.prototype.improve;


/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom", 1, "white");
        Sheep sheep2 = (Sheep) sheep.clone();

        System.out.println(sheep.toString()+sheep.hashCode());
        System.out.println(sheep2.toString()+sheep2.hashCode());
    }
}
