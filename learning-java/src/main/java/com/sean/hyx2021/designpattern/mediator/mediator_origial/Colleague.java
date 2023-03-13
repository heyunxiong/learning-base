package com.sean.hyx2021.designpattern.mediator.mediator_origial;


/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {

        this.mediator = mediator;
        this.name = name;

    }

    public Mediator GetMediator() {
        return this.mediator;
    }

    public abstract void SendMessage(int stateChange);
}
