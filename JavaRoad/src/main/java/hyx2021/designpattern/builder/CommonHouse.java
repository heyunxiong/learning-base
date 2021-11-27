package hyx2021.designpattern.builder;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBase() {
        System.out.println("CommonHouse buildBase ");
    }

    @Override
    public void buildWall() {
        System.out.println("CommonHouse buildWall ");
    }

    @Override
    public void roof() {
        System.out.println("CommonHouse roof ");
    }
}
