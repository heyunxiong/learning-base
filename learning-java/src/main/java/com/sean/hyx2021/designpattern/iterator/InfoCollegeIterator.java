package com.sean.hyx2021.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class InfoCollegeIterator implements Iterator {

    // ArrayList保存Department
    List<Department> departments = null;

    int position = 0; //下标判断

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    public boolean hasNext() {
        if (position >= departments.size() -1) {
            return false;
        }else {
            position += 1;
            return true;
        }
    }

    public Object next() {
        return departments.get(position);
    }

    public void remove() {

    }
}
