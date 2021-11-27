package hyx2021.designpattern.decorator;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setDes("add milk");
        setPrice(2.0f);
    }
}
