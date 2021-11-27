package hyx2020.com.thread;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 5/1/2020
 */
public class MyThread2 implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程：" + i);
        }
    }

    public static void main(String[] args) {
        // 创建一个实现了Runnable接口的线程类
        MyThread2 myThread2 = new MyThread2();
        // Thread有一个能接受实现了Runnable接口的构造器方法，和继承Thread不同，继承的可以直接调用。其本质都是实现了Runnable
        Thread thread = new Thread(myThread2);
        // 开启线程
        thread.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("Main 线程：" + i);
        }
    }
}
