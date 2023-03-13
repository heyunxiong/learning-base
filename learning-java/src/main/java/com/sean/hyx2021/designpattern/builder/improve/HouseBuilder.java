package com.sean.hyx2021.designpattern.builder.improve;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */

//抽象的建造者
public abstract class HouseBuilder {

    protected House house =new House();

    //抽象的建造过程

    public abstract void buildBase();
    public abstract void buildWall();
    public abstract void buildRoof();

    // 返回建好的房子
    public House buildHouse(){
        System.out.println("done build");
        return house;
    }

}
