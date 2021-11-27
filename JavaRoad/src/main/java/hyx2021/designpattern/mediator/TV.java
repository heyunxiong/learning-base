package hyx2021.designpattern.mediator;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class TV extends Appliance {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    void sendTV(int stateChange) {
        sendMessage(stateChange);
    }
    @Override
    void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }

    void startTV(){
        System.out.println("开启电视");
    }
    void stopTV(){
        System.out.println("关闭电视");
    }
}
