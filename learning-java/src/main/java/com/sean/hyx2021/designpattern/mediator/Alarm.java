package com.sean.hyx2021.designpattern.mediator;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class Alarm extends Appliance {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }
    @Override
    void sendMessage(int stateChange) {
    this.getMediator().getMessage(stateChange,this.name);
    }
}
