package MultiThreading.practise;

import java.util.concurrent.locks.ReentrantLock;

public class ReenterentLock {

    private final ReentrantLock lock = new ReentrantLock();

    void outer() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " entered outer()");
            Thread.sleep(1000);  // simulate some work
            inner();  // call inner method
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " exiting outer()");
            lock.unlock();
        }
    }

    void inner() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " entered inner()");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " exiting inner()");
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        ReenterentLock resource = new ReenterentLock();

        Thread t1 = new Thread(resource::outer, "Thread-1");
        Thread t2 = new Thread(resource::outer, "Thread-2");

        t1.start();
        t2.start();
    }
}
