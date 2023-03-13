package com.sean.hyx2023;

/**
 * Author: Sean He
 * Date: 2023/3/13
 */
public class MyClient {
    public static void main(String[] args) {
        MyClient client = new MyClient();
        client.methodA("China",0);
        client.methodA("China","123");
//        client.methodA("China");China
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count = count++;
        }
        System.out.println(count);
    }
    void methodA(String s, Integer... is){

    }
    void methodA(String s, String... is){

    }
}
