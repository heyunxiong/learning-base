package hyx2021.designpattern.decorator;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        //这个price是调料的， 这个drink.price是咖啡的。
      return super.getPrice()+ drink.cost();

    }

    @Override
    public String getDes() {
        // super.des是牛奶描述；super.getprice（）是牛奶价钱。  drink是咖啡的价钱
        return super.des+""+super.getPrice()+"&&"+ drink.getDes();
    }
}
