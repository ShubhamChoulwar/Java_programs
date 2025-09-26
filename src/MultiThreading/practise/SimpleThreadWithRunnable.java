package MultiThreading.practise;

/**
 * 1. instead of Thread extends, implementing with Runnable interface
 */

public class SimpleThreadWithRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        SimpleThreadWithRunnable S1 = new SimpleThreadWithRunnable();
        Thread t1 = new Thread(S1);    //creating new thread to start the thread
        t1.start();      //here with runnable interface we can not call start method as start is method of thread

        /**
         * What happens here
         * When you call S1.run() directly, you’re just invoking a normal method.
         * That means the for loop inside run() executes on the main thread, not on a new thread.
         * So, both S1.run() and your second for loop run sequentially on main, not concurrently.
         */
        S1.run();
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
