package hyx2021.designpattern.mediator;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public abstract class Mediator {
    public abstract void register(String name, Appliance appliance);

    public abstract void getMessage(int stateChange, String name);

    abstract void sendMessage();
}
