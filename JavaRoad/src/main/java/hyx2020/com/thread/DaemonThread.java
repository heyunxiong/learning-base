package hyx2020.com.thread;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 5/1/2020
 */
public class DaemonThread  {

    public static void main(String[] args) {
        Thread god = new Thread(new God());
        god.setDaemon(true); //设置为守护进程，默认是false， JVM不会管守护进程有没有执行完毕，只要用户进程执行完毕了，那么程序就结束，守护线程一样会被停止。
        god.start();

        Thread human = new Thread(new Human());
        human.start();
    }

}


class God implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("God always bless you! 上帝守护进程");
        }
    }
}

class Human implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
            System.out.println("human is weak! can live "+ i +"days");
        }
        System.out.println("==========see you ==============");
    }
}