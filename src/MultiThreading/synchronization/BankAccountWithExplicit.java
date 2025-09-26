package MultiThreading.synchronization;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountWithExplicit {
    private int balance = 500;

    private Lock lock = new ReentrantLock();
    public void  withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "Attempting to withdraw: " + amount);
        if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
            if (balance >= amount) {

                try {
                    System.out.println(Thread.currentThread().getName() + " Proceeding with withdrawl");
                    Thread.sleep(10000);      //Intrinsic: this if we have sleep then thread will wait for given sleep then thread1 will unlock and second thread will get execute
                } catch (Exception e) {

                } finally{
                   lock.unlock();
                }
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " Completed withdrawl " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + "Insufficient balance");
            }
        } else{
            System.out.println(Thread.currentThread().getName() + "came out without execution due to lock -true");
        }
    }
}

