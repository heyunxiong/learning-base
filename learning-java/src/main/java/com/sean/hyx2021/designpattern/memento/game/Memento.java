package com.sean.hyx2021.designpattern.memento.game;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/3/2020
 */
public class Memento {

    private int attack;
    private int defense;

    public Memento(int attack, int defense) {
        this.attack = attack;
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
