package com.sean.hyx2021.designpattern.factory.simplefactory.pizzastore.order;


import com.sean.hyx2021.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.util.Scanner;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class OrderPizzaSimpleFactory {
    //定义一个简单工厂对象，跟这个工厂下订单
    private SimpleFactory simpleFactory;

    //定义一个Pizza
    Pizza pizza;

    public OrderPizzaSimpleFactory(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }


    public void setFactory(SimpleFactory factory){
        String orderType = getType();
        this.simpleFactory = factory;
        pizza = simpleFactory.createPizza(orderType);
        if (pizza != null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }

    private String getType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你要的pizza种类 greek or cheese？");
        String type = scanner.nextLine();
        return type;
    }

}
