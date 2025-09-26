package MultiThreading.synchronization;

public class MainWithIntrinsic {
    public static void main(String[] args) {

        BankAccountWithIntrinsic sbi = new BankAccountWithIntrinsic();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    sbi.withdraw(50);
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
