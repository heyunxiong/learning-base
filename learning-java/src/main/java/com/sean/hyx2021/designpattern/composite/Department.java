package com.sean.hyx2021.designpattern.composite;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class Department extends OrganizationComponent {
    // add.remove 方法不需要了，因为是最小的叶子节点，不需要管理其他组织结构

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void print() {
        System.out.println("Here is your department：" + getName());
    }
}
