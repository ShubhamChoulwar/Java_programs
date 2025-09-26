package MultiThreading.synchronization;

/**
 * we are passing same counter in both threads which will increment the count but result will vary because both will try to get next count so mismatch
 *to avoid this issue see the Counter1 class.
 * */
public class Test {
    public static void main(String[] args) throws InterruptedException {

        //non synchronized with two threads
        Counter c1 = new Counter();
        MyThread t1 = new MyThread(c1);
        MyThread t2 = new MyThread(c1);
        t1.start();
        t2.start();
        t1.join();    //if we execute below print without join method then you will see count will always 0 because below print is of main thread which will run first
        t2.join();
        System.out.println("Non-Synchronized count : " + c1.getCount());

        //synchronized with two threads
        Counter1 c2 = new Counter1();
        MyThread1 t10 = new MyThread1(c2);
        MyThread1 t20 = new MyThread1(c2);
        t10.start();
        t20.start();
        t10.join();    //if we execute below print without join method then you will see count will always 0 because below print is of main thread which will run first
        t20.join();
        System.out.println("Synchronized count : " + c2.getCount());

    }
}
