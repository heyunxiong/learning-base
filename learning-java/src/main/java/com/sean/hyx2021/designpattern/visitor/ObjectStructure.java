package com.sean.hyx2021.designpattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class ObjectStructure {
    // 维护Person集合
    private List<Person> persons = new LinkedList<Person>();

    // 添加到List
    void attach(Person p) {
        persons.add(p);

    }
    void delete(Person p) {
        persons.remove(p);
    }

    // 显示测试结果
    void display(Action action) {
        for (Person p : persons) {
            p.accept(action);
        }
    }

}
