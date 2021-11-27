package hyx2021.designpattern.iterator;

import java.util.Iterator;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class ComputerCollege implements College {
    Department[] departments;

/*    public ComputerCollege(Department[] departments) {
        this.departments = departments;
    }*/

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java","Java专业");
        addDepartment("PHP","PHP专业");
        addDepartment("Python","Python专业");
        addDepartment("Go","Go专业");
        addDepartment("BigData","BigData专业");
    }

    int numOfDeparment = 0 ;// 保存当前数组的对象个数

    public String getName() {
        return "计算机学院";
    }

    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[numOfDeparment] = department;
        numOfDeparment++;
    }

    public Iterator createIterator() {

        return new ComputerCollegeIterator(departments);
    }
}
