package com.sean.hyx2021.designpattern.composite;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public abstract class OrganizationComponent {
    private String name;
    private String desc;

    //默认实现，处理的原因是尽可能不能让叶子节点去实现抽象方法
    protected void add(OrganizationComponent component){
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent component){
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String desc) {
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
    // 由子类去实现
    protected abstract void print();
}
