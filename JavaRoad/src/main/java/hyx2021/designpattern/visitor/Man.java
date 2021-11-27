package hyx2021.designpattern.visitor;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class Man extends Person {

    @Override
    void accept(Action action) {
        action.getManResult(this);
    }
}
