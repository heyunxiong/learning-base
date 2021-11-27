package hyx2020.hyx.ch1_01;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 8/21/2020
 */
public class MyThread extends Thread {
    @Override
    public void run() {
//        super.run();
        System.out.println(Thread.currentThread().getName() + "=====> MyThrad");
    }
}
