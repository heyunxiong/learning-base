package hyx2021.designpattern.bridge;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
//
public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("folded phone is open....");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("folded phone is close....");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("folded phone is call....");
    }
}
