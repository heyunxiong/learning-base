package hyx2021.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */

// 输出多个学院的情况，做一层抽象
public class Output {

    List<College> collegeList;

    public Output(List<College> collegeList) {
        this.collegeList = collegeList;
    }
    // 遍历输出学院
    void printCollege(){
        Iterator<College> iterator = collegeList.iterator();

        while (iterator.hasNext()) {
            College college = iterator.next();
            System.out.println("==========college name:" + college.getName());
            printDepartment(college.createIterator());
        }
    }

    // 遍历输出专业系
    void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department next = (Department)iterator.next();
            System.out.println(next.getName());
        }
    }



}
