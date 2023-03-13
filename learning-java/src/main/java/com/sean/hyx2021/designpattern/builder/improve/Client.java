package com.sean.hyx2021.designpattern.builder.improve;


/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class Client {
    public static void main(String[] args) {
        HouseBuilder commonHouse = new CommonHouse();
        HouseBuilder highBuidling = new HighBuidling();

        // 使用指挥者创建你喜欢的房子
        HouseDirector houseDirector = new HouseDirector(highBuidling);
        // 创建房子
        House house = houseDirector.constructHouse();

        // 获取房子的信息
        System.out.println(house.getBase());
        System.out.println(house.getWall());
        System.out.println(house.getRoof());
    }
}
