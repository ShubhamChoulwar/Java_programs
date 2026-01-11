package Practice_Multithreading;

public class CreateMultipleThreads extends Thread {
    @Override
    public void run() {
        System.out.println("Creating Multiple Threads using thread : " + Thread.currentThread().getName());
    }
}
