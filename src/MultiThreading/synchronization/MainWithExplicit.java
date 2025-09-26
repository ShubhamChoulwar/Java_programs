package MultiThreading.synchronization;

/**
 * Explicit lock to have custo synchronization with given waititing time. in this case no need to
 * give synchroniztion on method or class level
 * just have manually create lock object as below.
 */
public class MainWithExplicit {
    public static void main(String[] args) {

        BankAccountWithExplicit ICICI = new BankAccountWithExplicit();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    ICICI.withdraw(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        t1.start();
        t2.start();
    }
}
