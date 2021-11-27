package hyx2020.com.thread;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 5/2/2020
 */
public class ProducerAndConsumer {
    public static void main(String[] args) {
        CachePool cachePool = new CachePool();
        Producer producer = new Producer(cachePool);
        Consumer consumer = new Consumer(cachePool);

        new Thread(producer).start();
        new Thread(consumer).start();

    }
}


class Producer implements Runnable {
    CachePool cachePool;

    public Producer(CachePool cachePool) {
        this.cachePool = cachePool;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            try {
                cachePool.push(new Product(i));
                System.out.println("Producer produces : " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    CachePool cachePool;

    public Consumer(CachePool cachePool) {
        this.cachePool = cachePool;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            try {
                cachePool.pop();
                System.out.println("Consumer consumes " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Product {
    int id;

    public Product(int id) {
        this.id = id;
    }
}

class CachePool {
    // 池子里最多能放10个产品
    Product[] products = new Product[10];
    // 计数器用来判断
    int count = 0;

    public synchronized void push(Product product) throws InterruptedException {
        if (count == products.length) {
            this.wait();
        }
        products[count] = product;
        count++;
        this.notifyAll();
    }

    public synchronized Product pop() throws InterruptedException {
        if(count == 0){
            this.wait();
        }
        Product product = products[count];
        count--;
        this.notifyAll();
        return product;
    }

}