package hyx2020.com.thread;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 5/1/2020
 */

/*
 *  创建线程方法一：继承Thead
 *  重写run方法，调用start开启线程
 */
public class MyThread extends Thread {

    @Override


    // run 方法才是线程的灵魂
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println( "子线程：" + i);
        }
    }

    public static void main(String[] args) {
        //创建子线程对象
        MyThread myThread = new MyThread();
        // 调用start方法，开启线程；切记不要调用run方法，直接调用run方法并不是开启线程，而只是方法调用，势必会先跑完子线程返回后才继续执行。
        myThread.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("Main线程： " + i);
        }
    }
}
