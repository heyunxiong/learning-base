package com.sean.hyx2021.designpattern.command;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public interface Command {
    //执行操作
    void execute();

    //撤掉操作
    void undo();
}
