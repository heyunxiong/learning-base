package com.sean.hyx2021.com.sean.functionaljava;


import javax.swing.*;
import java.util.function.Predicate;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/28/2020
 */

public class JavaLambdaMain {

    public static void mCain(String[] args) {
        int i = 10;
        Runnable runnable = () -> System.out.println("runnable");

        new Runnable(){
            @Override
            public void run() {
                System.out.println(i);
            }
        };

        Predicate<Integer> predicate = x -> x > 5;

        JButton button = new JButton();
        button.addActionListener(event -> System.out.println(event.getActionCommand()));


    }

}
