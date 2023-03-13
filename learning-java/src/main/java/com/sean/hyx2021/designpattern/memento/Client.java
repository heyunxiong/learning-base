package com.sean.hyx2021.designpattern.memento;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/3/2020
 */
public class Client {
    public static void main(String[] args) {
        //创建的时候回自动的创建一个备份的。
        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        originator.setState("state1");

        caretaker.add(originator.saveStateMemento());

        originator.setState("state2");

        caretaker.add(originator.saveStateMemento());

        originator.setState("state3");

        caretaker.add(originator.saveStateMemento());

        System.out.println("当前状态是 ====> " + originator.getState());
        //恢复到状态1
        //System.out.println(caretaker.get(0).getState());
        originator.getMemento(caretaker.get(0));

        System.out.println("恢复后状态是 ====> " + originator.getState());


    }
}
