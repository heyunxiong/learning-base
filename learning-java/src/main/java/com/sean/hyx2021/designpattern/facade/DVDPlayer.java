package com.sean.hyx2021.designpattern.facade;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class DVDPlayer {
    // 单例模式 饿汉写法
    private DVDPlayer() {}

    public static DVDPlayer dvdPlayer = new DVDPlayer();

    public static DVDPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    void on(){
        System.out.println("DVD is on ");
    }

    void off(){
        System.out.println("DVD is off ");
    }

    void play(){
        System.out.println("DVD is playing ");
    }

    void pause(){
        System.out.println("DVD paused");
    }
}
