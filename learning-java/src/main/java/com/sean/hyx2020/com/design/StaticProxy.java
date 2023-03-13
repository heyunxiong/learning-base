package com.sean.hyx2020.com.design;

import javax.sound.midi.SoundbankResource;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 5/1/2020
 */

/**
 * 静态代理
 */
public class StaticProxy {
    public static void main(String[] args) {

        Person sean = new Person("Sean");

        Company company = new Company(sean);

        company.rent();

    }
}

// 租房方法
interface Rent {
   void rent();
}

// 个人
class Person implements Rent {
    private String name;
    @Override
    public void rent() {
        System.out.println(name + "要租房！");
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}


// 中介公司
class Company implements Rent{

    Rent target;

    Company(Rent target){
        this.target = target;
    }

    @Override
    public void rent() {
        before();
        this.target.rent();
        after();
    }

    private void after() {
        System.out.println("租房之后");
    }

    private void before() {
        System.out.println("租房之前");
    }
}
