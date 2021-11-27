package hyx2021.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */

// Composite角色，管理College
public class University extends OrganizationComponent {

    List<OrganizationComponent> collegeList = new ArrayList<OrganizationComponent>();

    public University(String name, String desc) {
        super(name, desc);
    }

    //重写add/remove方法。用来管理
    @Override
    protected void add(OrganizationComponent component) {
        collegeList.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        collegeList.remove(component);
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
        System.out.println("University======>"+getName());

        for (OrganizationComponent componentItem : collegeList) {
            componentItem.print();
        }

    }
}
