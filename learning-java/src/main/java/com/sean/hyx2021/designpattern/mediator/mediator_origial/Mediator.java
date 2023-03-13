package com.sean.hyx2021.designpattern.mediator.mediator_origial;
/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public abstract class Mediator {
    //将给中介者对象，加入到集合中
    public abstract void Register(String colleagueName, Colleague colleague);

    //接收消息, 具体的同事对象发出
    public abstract void GetMessage(int stateChange, String colleagueName);

    public abstract void SendMessage();
}
