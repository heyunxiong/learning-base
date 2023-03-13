package com.sean.hyx2021.designpattern.prototype.improve;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class Sheep implements Cloneable{
        private String name;
        private int age;
        private String color;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

        public String getName() {
        return name;
    }

        public void setName(String name) {
        this.name = name;
    }

        public int getAge() {
        return age;
    }

        public void setAge(int age) {
        this.age = age;
    }

        public String getColor() {
        return color;
    }

        public void setColor(String color) {
        this.color = color;
    }
    // 使用Object的clone方法 克隆该类的对象
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep  = null;
        sheep = (Sheep) super.clone();
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
