package com.sean.hyx2021.designpattern.builder.improve;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBase() {
        house.setBase("common base");
        System.out.println("普通房子build Base ");
    }

    @Override
    public void buildWall() {
        house.setWall("common wall");
        System.out.println("普通房子build Wall ");
    }

    @Override
    public void buildRoof() {
        house.setRoof("common roof");
        System.out.println("普通房子build Roof ");
    }
}
