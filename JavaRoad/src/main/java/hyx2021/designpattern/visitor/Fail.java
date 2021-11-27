package hyx2021.designpattern.visitor;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class Fail extends Action {
    @Override
    void getManResult(Man man) {
        System.out.println("Man Failed!!!");
    }

    @Override
    void getWomanResult(Woman woman) {
        System.out.println("Woman Failed!!!");
    }
}
