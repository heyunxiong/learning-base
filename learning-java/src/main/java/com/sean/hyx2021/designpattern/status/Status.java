package com.sean.hyx2021.designpattern.status;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/3/2020
 */
public abstract class Status {
    // 扣除积分
    abstract void deductMoney();
    // 是否中奖
    abstract boolean raffle();
    // 发放奖品
    abstract void dispensePrize();

}
