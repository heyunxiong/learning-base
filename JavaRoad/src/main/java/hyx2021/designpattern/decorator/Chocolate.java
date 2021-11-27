package hyx2021.designpattern.decorator;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setDes("add Chocolate");
        setPrice(3.0f);
    }
}
