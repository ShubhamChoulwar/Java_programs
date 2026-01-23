package practise_Multithreading.Synchronization;

public class Counter {

    private int count = 0;

    public synchronized void increment(){
        count++;
        System.out.println(Thread.currentThread() + "->" +count);
    }

    public int getCount(){
        return count;
    }
}
