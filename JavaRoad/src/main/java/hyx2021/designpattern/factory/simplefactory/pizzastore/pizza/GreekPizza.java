package hyx2021.designpattern.factory.simplefactory.pizzastore.pizza;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备Greek Pizza原材料");
    }
}
