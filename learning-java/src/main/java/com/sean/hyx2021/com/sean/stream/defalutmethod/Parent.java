package com.sean.hyx2021.com.sean.stream.defalutmethod;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/29/2020
 */
public interface Parent {
    public void message(String body);
    public default void welcome(){
        message("Parent : Hi");

    }
    public String getLastMessage();
}
