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

}
