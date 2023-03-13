package com.sean.hyx2021.designpattern.iterator;
import java.util.Iterator;


/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class ComputerCollegeIterator implements Iterator {
    // 学院里面有专业, 数组形式保存
    private Department[] departments;

    int position = 0; // 遍历的位置,坐标判断

    public ComputerCollegeIterator(Department[] department) {
        this.departments = department;
    }

    //
    public boolean hasNext() {

        //下标大于数组长度，越界了就没有下一个元素了
        if (position >= departments.length || departments[position] == null) {
            return false;
        }else {
            return true;
        }
    }

    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    public void remove() {

    }
}
