package hyx2021.designpattern.composite;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("abc university", "abc大学");

        OrganizationComponent computerCollege = new College("Computer College", "计算机学院");
        OrganizationComponent softwareCollege = new College("sofetware College", "软件学院");

        university.add(computerCollege);
        university.add(softwareCollege);

        computerCollege.add(new Department("com&science", "计算机科学与技术专业"));
        computerCollege.add(new Department("network", "网络工程"));
        computerCollege.add(new Department("connecting", "通信工程"));

        softwareCollege.add(new Department("soft&engineer", "软件工程"));
        softwareCollege.add(new Department("ITmanagement", "信息管理"));


        //输出整个学校的组织结构
        university.print();

        //计算机学院的组织结构
        computerCollege.print();
        //软件学院的额组织结构
        softwareCollege.print();

    }
}
