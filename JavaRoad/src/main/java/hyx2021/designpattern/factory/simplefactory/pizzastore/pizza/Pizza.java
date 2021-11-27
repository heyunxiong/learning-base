package hyx2021.designpattern.factory.simplefactory.pizzastore.pizza;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public abstract class Pizza {
    protected String name;

    public abstract void prepare();

    public void bake(){
        System.out.println(name + "bake");
    }
    public void cut(){
        System.out.println(name + "cut");
    }
    public void box(){
        System.out.println(name + "box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
