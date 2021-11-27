package hyx2021.designpattern.adapter;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class Phone {
    public void charge(Voltage5V voltage5V){
        if(voltage5V.output5V() == 5){
            System.out.println("phone now is charging");
        }
    }
}
