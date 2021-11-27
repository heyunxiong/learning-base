package hyx2021.designpattern.factory.simplefactory.pizzastore.order;

import hyx2021.designpattern.factory.simplefactory.pizzastore.pizza.CheersPizza;
import hyx2021.designpattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import hyx2021.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.util.Scanner;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class OrderPizza {
    // 构造器
    public OrderPizza() {
        String orderType = null;
        Pizza pizza = null;
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("greek pizze ");
            }else if(orderType.equals("cheese")) {
                pizza = new CheersPizza();
                pizza.setName("cheese pizze ");
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.bake();
        }while(true);

    }

    private String getType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你要的pizza种类 greek or cheese？");
        String type = scanner.nextLine();
        return type;
    }
}
