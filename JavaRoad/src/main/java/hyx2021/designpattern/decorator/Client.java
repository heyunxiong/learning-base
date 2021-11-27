package hyx2021.designpattern.decorator;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class Client {
    public static void main(String[] args) {
        Drink longBlack = new LongBlack();

        System.out.println("单单一杯美式咖啡的价格："+longBlack.cost());
        System.out.println("咖啡的描述："+longBlack.getDes());

        // 给美式加一份牛奶
        longBlack = new Milk(longBlack);
        System.out.println("加了牛奶的美式咖啡的价格："+longBlack.cost());
        System.out.println("牛奶咖啡的描述："+longBlack.getDes());
        System.out.println("=============");
        // 再在一份巧克力
        longBlack = new Chocolate(longBlack);
        System.out.println("加了牛奶+巧克力的美式咖啡的价格："+longBlack.cost());
        System.out.println("牛奶+巧克力咖啡的描述："+longBlack.getDes());

        // shortblack咖啡
        System.out.println("==========");
        Drink shortBlack = new ShortBlack();
        shortBlack = new Milk(shortBlack);
        shortBlack = new Chocolate(shortBlack);
        System.out.println(shortBlack.cost());


    }
}
