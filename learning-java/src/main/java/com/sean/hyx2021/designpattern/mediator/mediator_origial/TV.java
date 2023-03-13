package com.sean.hyx2021.designpattern.mediator.mediator_origial;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        // TODO Auto-generated constructor stub
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        // TODO Auto-generated method stub
        this.GetMediator().GetMessage(stateChange, this.name);
    }

    public void StartTv() {
        // TODO Auto-generated method stub
        System.out.println("It's time to StartTv!");
    }

    public void StopTv() {
        // TODO Auto-generated method stub
        System.out.println("StopTv!");
    }
}
