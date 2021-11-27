package hyx2021.com.sean.thread;

import java.util.concurrent.*;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/15/2021
 */
public class MyThread3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Task task = new Task();
        Future<Integer> future = executorService.submit(task);
        executorService.shutdown();

        System.out.println("主线程在执行任务...");
        try {
            Thread.sleep(2000);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }

        try {
            System.out.println("task运行结果:"+future.get());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (ExecutionException ex) {
            ex.printStackTrace();
        }
        System.out.println("所有任务执行完毕");
    }
}
class Task2 implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println("子线程在执行任务...");
        //模拟任务耗时
        Thread.sleep(5000);
        return 1000;
    }
}
