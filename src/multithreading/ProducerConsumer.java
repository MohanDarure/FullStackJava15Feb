package multithreading;

public class ProducerConsumer {
    int num;

    boolean flag = false;

    public synchronized void put(int num) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Put:" + num);
        this.num = num;
        flag = true;
        notify();

    }

    public synchronized void get() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get:" + num);
        flag = false;
        notify();
    }
}

class Producer implements Runnable {

    ProducerConsumer producerConsumer;

    Producer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
        Thread thread = new Thread(this, "Producer");
        thread.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            producerConsumer.put(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Consumer implements Runnable {

    ProducerConsumer producerConsumer;

    Consumer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
        Thread thread = new Thread(this, "Consumer");
        thread.start();
    }

    @Override
    public void run() {

        while (true) {
            producerConsumer.get();
            try {
                Thread.sleep(500);
            } catch
            (InterruptedException e) {
            }
        }
    }
}

class PCMain {

    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Producer producer = new Producer(producerConsumer);
        Consumer consumer = new Consumer(producerConsumer);


    }
}