package com.sean.hyx2021.designpattern.iterator;

import java.util.Iterator;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public interface College {
    //获取学院的名字
    String getName();

    //增加系的方法
    void addDepartment(String name, String desc);

    //返回迭代器
    Iterator createIterator();
}
