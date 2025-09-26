package MultiThreading.practise;

/**
 * Interrupt method is used to interrupt the thread from any state like sleep,wait,timed-wait etc.
 */
public class InterruptedMethod extends Thread{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread interrupted during sleep for 1 sec." + e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        InterruptedMethod i1 = new InterruptedMethod();
        i1.start();
        i1.interrupt();

    }
}
