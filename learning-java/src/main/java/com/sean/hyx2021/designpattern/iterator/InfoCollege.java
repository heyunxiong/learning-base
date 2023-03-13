package com.sean.hyx2021.designpattern.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class InfoCollege implements  College {
    List<Department> departments;

/*    public ComputerCollege(Department[] departments) {
        this.departments = departments;
    }*/

    public InfoCollege() {
        departments = new ArrayList<Department>();
        addDepartment("信息专业1","xinxi");
        addDepartment("信息专业2","xinxi2");
        addDepartment("信息专业3","xinxi3");
        addDepartment("信息专业4","xinxi4");
        addDepartment("信息专业5","xinxi5");
    }

    int numOfDeparment = 0 ;// 保存当前数组的对象个数

    public String getName() {
        return "信息学院";
    }

    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments.add(department);
    }

    public Iterator createIterator() {

        return new InfoCollegeIterator(departments);
    }
}
