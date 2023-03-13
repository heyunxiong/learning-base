package com.sean.hyx2020.com.beautifulthread;

import java.util.Random;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/24/2020
 */
public class MyTreadLocalRandom {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(5));
        }
    }
}
