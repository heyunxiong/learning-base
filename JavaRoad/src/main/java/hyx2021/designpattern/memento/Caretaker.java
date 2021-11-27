package hyx2021.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/3/2020
 */
public class Caretaker {

    //维护多个备忘录对象
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    // 获得指定的Originator对象
    public Memento get(int index) {
        return mementoList.get(index);
    }


}
