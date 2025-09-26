package MultiThreading.practise;

/**
 * Simple example to create and start the thread.
 * 1. here if you not override run method and try another method with some code,
 * when S1.start(), JVM will look for default run method from thread class which has no any implementation and will stop quickly
 * 2. if you override run method with some implementation then it will show result.
 */

public class SimpleThreadCreation extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    //with this method, thread will not call this method as thread will look for run methos only
    /*public void method(){
        System.out.println(Thread.currentThread().getName());
    }*/

    public static void main(String[] args) {
        SimpleThreadCreation S1 = new SimpleThreadCreation();
        S1.start();
        System.out.println("main class thread: " + Thread.currentThread().getName());  //every class has its own thread
    }
}
