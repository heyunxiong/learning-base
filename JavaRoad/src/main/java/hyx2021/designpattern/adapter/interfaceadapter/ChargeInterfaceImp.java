package hyx2021.designpattern.adapter.interfaceadapter;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/29/2020
 */
//只使用接口中想要用到的方法
public class ChargeInterfaceImp {
    public static void main(String[] args) {
        AbsChargeInterface absChargeInterface = new AbsChargeInterface() {
            // 现在我们只需使用5V和18V电压，选择性重写就好了
            @Override
            public int output5V() {
                int src = 5;
                System.out.println(src);
                return src;
            }

            @Override
            public int output18V() {

                int src = 18;
                System.out.println(src);
                return src;
            }
        };
        absChargeInterface.output5V();
        absChargeInterface.output18V();
    }
}
