package hyx2021.designpattern.builder;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/28/2020
 */
public abstract class AbstractHouse {

    public abstract void buildBase();
    public abstract void buildWall();
    public abstract void roof();

    public void build(){
        buildBase();
        buildWall();
        roof();
    }
}
