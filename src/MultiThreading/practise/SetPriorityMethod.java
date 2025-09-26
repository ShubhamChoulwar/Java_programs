package MultiThreading.practise;

/**
 * this method will set the priority of each thread to decide further execution
 */
public class SetPriorityMethod extends Thread{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + "-Priority-" + Thread.currentThread().getPriority());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        SetPriorityMethod p1 = new SetPriorityMethod();
        SetPriorityMethod p2 = new SetPriorityMethod();
        SetPriorityMethod p3 = new SetPriorityMethod();
        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.NORM_PRIORITY);
        p3.setPriority(Thread.MAX_PRIORITY);
        p1.start();

    }
}
