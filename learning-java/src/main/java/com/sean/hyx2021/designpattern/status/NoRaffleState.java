package com.sean.hyx2021.designpattern.status;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/3/2020
 */
public class NoRaffleState extends Status {

    @Override
    void deductMoney() {

    }

    @Override
    boolean raffle() {
        return false;
    }

    @Override
    void dispensePrize() {

    }
}
