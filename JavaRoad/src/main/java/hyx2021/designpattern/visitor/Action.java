package hyx2021.designpattern.visitor;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public abstract class Action {

    // 获得男歌手的测评
    abstract void getManResult(Man man);

    //获得女歌手的测评
    abstract void getWomanResult(Woman woman);
}
