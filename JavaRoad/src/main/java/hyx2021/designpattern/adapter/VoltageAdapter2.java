package hyx2021.designpattern.adapter;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
public class VoltageAdapter2 implements Voltage5V {

    private Voltage220V voltage220V = null;

    public VoltageAdapter2(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {

        int srcV = voltage220V.output220V();
        int dstV = srcV / 44;
        System.out.println("使用对象适配器");
        return dstV;
    }
}
