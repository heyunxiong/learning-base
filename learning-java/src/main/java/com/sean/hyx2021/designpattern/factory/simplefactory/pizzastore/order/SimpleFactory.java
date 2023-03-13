package com.sean.hyx2021.designpattern.factory.simplefactory.pizzastore.order;


import com.sean.hyx2021.designpattern.factory.simplefactory.pizzastore.pizza.CheersPizza;
import com.sean.hyx2021.designpattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.sean.hyx2021.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType){
        System.out.println("使用SimpleFactory创建Pizza");

        Pizza pizza = null;
        do{
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("greek pizze ");
            }else if(orderType.equals("cheese")) {
                pizza = new CheersPizza();
                pizza.setName("cheese pizze ");
            }else{
                //do nothing
            }
            return pizza;
        }while (true);

    }
}
