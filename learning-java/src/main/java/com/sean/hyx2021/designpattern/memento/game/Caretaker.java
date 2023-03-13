package com.sean.hyx2021.designpattern.memento.game;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/3/2020
 */
public class Caretaker {
   //保存一个状态
    private Memento memento;
    //保存多个状态
    //private List<Memento> mementoList = new ArrayList<Memento>();


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
