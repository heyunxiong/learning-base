package hyx2021.designpattern.mediator;
/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */

// 家电抽象类
public abstract class Appliance {
    private Mediator mediator;
    public String name;

    public Appliance(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return  this.mediator;
    }

    abstract void sendMessage(int stateChange);

}
