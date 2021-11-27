package hyx2020.com.thread;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 5/1/2020
 */
public class ThreadStatus {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程：" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("===============end=================");
        });
        Thread.State state = thread.getState();
        System.out.println(state);
        thread.start();
        state= thread.getState();
        System.out.println(state);
        while (state != Thread.State.TERMINATED) {
            Thread.sleep(200);
            state = thread.getState();
            System.out.println(state);
        }
    }
}

