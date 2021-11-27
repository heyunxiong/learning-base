package hyx2021.designpattern.memento;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/3/2020
 */
public class Originator {

    private String state; //状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //保存状态Memento对象
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    public void getMemento(Memento memento) {
        state = memento.getState();
    }

}
