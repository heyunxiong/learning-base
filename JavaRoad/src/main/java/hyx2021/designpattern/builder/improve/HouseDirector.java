package hyx2021.designpattern.builder.improve;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
// 指挥者，处理构建房子的流程
public class HouseDirector {
    // 指挥者持有houseBuilder接口
    HouseBuilder houseBuilder = null;

    public HouseDirector() {
    }

    // 1.通过构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    // 2.通过set的方法传入houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //指挥者处理创建房子的流程

    public House constructHouse(){
        houseBuilder.buildBase();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }

}
