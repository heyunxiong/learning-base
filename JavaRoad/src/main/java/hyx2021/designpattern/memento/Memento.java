package hyx2021.designpattern.memento;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/3/2020
 */
public class Memento {

    private String state;


    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
