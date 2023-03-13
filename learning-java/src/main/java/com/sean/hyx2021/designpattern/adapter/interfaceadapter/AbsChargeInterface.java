package com.sean.hyx2021.designpattern.adapter.interfaceadapter;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */

//空实现接口方法
public abstract class AbsChargeInterface implements ChargeInterface {
    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output10V() {
        return 0;
    }

    @Override
    public int output18V() {
        return 0;
    }

    @Override
    public int output30V() {
        return 0;
    }
}
