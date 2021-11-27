package hyx2021.designpattern.builder.improve;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public class HighBuidling extends HouseBuilder {
    @Override
    public void buildBase() {
        house.setBase("high base");
        System.out.println("高级房子build Base ");
    }

    @Override
    public void buildWall() {
        house.setWall("high wall");
        System.out.println("高级房子build Wall ");
    }

    @Override
    public void buildRoof() {
        house.setRoof("high roof");
        System.out.println("高级房子build Roof ");
    }
}
