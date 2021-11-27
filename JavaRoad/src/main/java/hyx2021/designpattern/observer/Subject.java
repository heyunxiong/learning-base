package hyx2021.designpattern.observer;



/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
//气象站接口
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
