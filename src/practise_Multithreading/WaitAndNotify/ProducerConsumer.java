package practise_Multithreading.WaitAndNotify;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int capacity = 5;

    public synchronized void producer(int value) throws InterruptedException {
        while(queue.size() == capacity){
            wait();
        }
        queue.add(value);
        notify();
    }

    public synchronized void consumer() throws InterruptedException {
        while(queue.size() == 0){
            wait();
        }
        int value = queue.poll();
        System.out.println("Message cosumed: "+ value);
        notify();
    }

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Runnable task1 = () -> {
            try {
                producerConsumer.producer(4);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable task2 = () -> {
            try {
                producerConsumer.consumer();
            } catch (InterruptedException e) {}
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
    }

}
