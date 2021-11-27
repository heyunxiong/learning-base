package hyx2021.designpattern.decorator;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */

// 星巴克咖啡抽象类
public abstract class Drink {

    public String des; //咖啡种类的描述
    private float price = 0.0f; //咖啡价钱

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //抽象计费方法有子类去实现，种类+调料 比如 点了一杯美式多少钱，然后加了糖又需要多少钱
    public abstract float cost();

}
