package hyx2021.designpattern.facade;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
//投影仪
public class Peojector {

    private Peojector() {}

    public static Peojector peojector = new Peojector();

    public static Peojector getPeojector() {
        return peojector;
    }

    void on(){
        System.out.println("peojector is on ");
    }

    void off(){
        System.out.println("peojector is off ");
    }

    void play(){
        System.out.println("peojector is playing ");
    }

    void focus(){
        System.out.println("peojector is focusing");
    }
}
