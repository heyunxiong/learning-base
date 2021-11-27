package hyx2021.designpattern.bridge;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class BrandXiaomi implements Brand {
    @Override
    public void call() {
        System.out.println("xiaomi's call() ");
    }

    @Override
    public void close() {
        System.out.println("xiaomi's close() ");
    }

    @Override
    public void open() {
        System.out.println("xiaomi's open() ");
    }
}
