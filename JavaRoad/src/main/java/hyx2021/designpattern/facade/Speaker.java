package hyx2021.designpattern.facade;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
//音箱
public class Speaker {

    private Speaker() {}

    public static Speaker speaker = new Speaker();

    public static Speaker getSpeaker() {
        return speaker;
    }

    void on(){
        System.out.println("speaker is on ");
    }

    void off(){
        System.out.println("speaker is off ");
    }

    void play(){
        System.out.println("speaker is playing ");
    }

    void speak(){
        System.out.println("speaker is speaking");
    }
}
