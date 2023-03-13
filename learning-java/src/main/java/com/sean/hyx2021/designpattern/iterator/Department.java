package com.sean.hyx2021.designpattern.iterator;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class Department {

    private String name;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String desc;
}
