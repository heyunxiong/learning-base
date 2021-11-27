package hyx2021.com.sean.stream;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 2021-01-04
 */
public class DefaultInterfaceImp {
    public static void main(String[] args) {
        DefaultInterface defaultInterface = new DefaultInterface() {
            @Override
            public void say() {
                System.out.println("sya");
            }
        };
        defaultInterface.speak();

        DefaultInterface.callStatic();
    }



}
