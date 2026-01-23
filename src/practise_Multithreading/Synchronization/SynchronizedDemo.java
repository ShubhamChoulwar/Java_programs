package practise_Multithreading.Synchronization;

public class SynchronizedDemo {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {for(int i=0;i<100;i++) counter.increment();},"t1");

        Thread t2 = new Thread(() -> {for(int i=0;i<100;i++) counter.increment();},"t2");

        t1.start();
        //t1.join();
        t2.start();
        //t2.join();
        System.out.println(counter.getCount());
    }
}
