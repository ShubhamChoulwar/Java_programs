package MultiThreading.synchronization;

/**
 * explaination of intrinsic and explicit locking which are using when we apply synchronization
 * intrinsic - BankAccountWithIntrinsic class
 * explicit - BankAccountWithExplicit
 */
public class BankAccountWithIntrinsic {

    private int balance = 100;

    public synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "Attempting to withdraw: " + amount);
        if(balance >=amount){
            System.out.println(Thread.currentThread().getName() + " Proceeding with withdrawl");
            Thread.sleep(10000);      //Intrinsic: this if we have sleep then thread will wait for given sleep then thread1 will unlock and second thread will get execute
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Completed withdrawl " + balance);
        } else{
            System.out.println(Thread.currentThread().getName() + "Insufficient balance");
        }
    }
}
