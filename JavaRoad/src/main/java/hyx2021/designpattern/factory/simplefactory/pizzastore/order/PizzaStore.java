package hyx2021.designpattern.factory.simplefactory.pizzastore.order;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();
        new OrderPizzaSimpleFactory(new SimpleFactory());
    }
}
