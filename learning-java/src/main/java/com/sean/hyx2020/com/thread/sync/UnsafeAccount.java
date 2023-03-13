package com.sean.hyx2020.com.thread.sync;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 5/2/2020
 */
public class UnsafeAccount {

}

class Account {
    private String cardname;
    private double money;

    public Account(String cardname, double money) {
        this.cardname = cardname;
        this.money = money;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardname='" + cardname + '\'' +
                ", money=" + money +
                '}';
    }
}

class Bank implements Runnable {

    Account account;
    double withdraw;
    double remain;

    public Bank(Account account, double withdraw, double remain) {
        this.account = account;
        this.withdraw = withdraw;
        this.remain = remain;
    }

    @Override
    public void run() {
        if (account.getMoney() - withdraw <= 0) {
            System.out.println( "you are broken..." );
        }
        remain = account.getMoney() - withdraw;
    }

}