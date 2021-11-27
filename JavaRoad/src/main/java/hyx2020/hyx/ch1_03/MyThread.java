package hyx2020.hyx.ch1_03;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 8/21/2020
 */
public class MyThread extends Thread {
    private int i = 0;

    public MyThread(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("====>"+i);
    }
}
