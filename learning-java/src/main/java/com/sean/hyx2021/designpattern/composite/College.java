package com.sean.hyx2021.designpattern.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class College extends OrganizationComponent {

    List<OrganizationComponent> departmentList = new ArrayList<OrganizationComponent>();

    public College(String name, String desc) {
        super(name, desc);
    }

    //重写add/remove方法。用来管理
    @Override
    protected void add(OrganizationComponent component) {
        departmentList.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        departmentList.remove(component);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    //用来打印list里面的component
    @Override
    protected void print() {
        System.out.println("College=============>" + getName());
        for (OrganizationComponent componentItem : departmentList) {
            componentItem.print();
        }
    }

}
