package hyx2020.com.thread;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 5/1/2020
 */

/**
 * 不建议使用 stop 或者 destroy 方法直接停止线程，推荐使用标志符号
 */
public class StopThread implements Runnable {

    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag) {
                System.out.println("-----》子线程:" + i++);
        }
    }

    // 定义自己的stop方法，修改标志
    public void myStop(){
        this.flag = false;
    }

    public static void main(String[] args) {
        StopThread stopThread = new StopThread();
        // 子线程启动，会一直跑下去。
        new Thread(stopThread).start();

        // 主线程通过循环控制子线程，让其到达一个数的时候停止子线程
        for (int i = 0; i < 1000; i++) {
            System.out.println("Main线程：" + i);
            // 如果循环到10，那么该线程停止。然后继续执行11以后的线程
            if (i == 700) {
                stopThread.myStop();
                System.out.println("Main线程 ==100: ---> " + i);
            }
        }
    }
}
