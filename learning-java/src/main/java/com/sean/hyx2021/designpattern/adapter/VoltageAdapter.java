package com.sean.hyx2021.designpattern.adapter;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int output5V() {
        //获取
        int srcV = output220V();
        int dstV = srcV / 44 ; //进行降压
        return dstV;
    }
}
