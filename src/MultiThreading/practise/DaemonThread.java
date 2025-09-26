package MultiThreading.practise;

/**
 * we are creating threads that means this is user thread.
 * Daemon threads runs in backgroud
 * if we have user thread and execution of thread has been completed then JVM will not worry on Daemon thread and will stop the program.
 * in below example on loop is running infinite time with thread d1 and we have main thread also which will print main thread
 * so now when d1 thread runs in between main thread will run and main thread will stop and we have setDaemon to true to d1
 * then what jvm will see that daemon set to true so further execution of d1 should stop.
 * You must call setDaemon(true) before starting the thread, otherwise IllegalThreadStateException.
 * Since daemon threads don’t guarantee execution till completion (JVM can kill them anytime), they are not suitable for critical tasks (e.g., saving data to DB).
 */


public class DaemonThread extends Thread{

    @Override
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        DaemonThread d1 = new DaemonThread();
        d1.setDaemon(true);
        d1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
