package hyx2021.designpattern.adapter;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
// 被适配的类
public class Voltage220V {
    int src = 220;

    //输出220V电压
    public int output220V() {
        System.out.println("output 220V");
        return src;
    }
}
