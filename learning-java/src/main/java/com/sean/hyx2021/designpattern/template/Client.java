package com.sean.hyx2021.designpattern.template;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/30/2020
 */
public class Client {
    public static void main(String[] args) {
        SoyaMilkTemplate blackSoyaMilk = new BlackSoyaMilk();
        blackSoyaMilk.make();

        SoyaMilkTemplate peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

    }
}
