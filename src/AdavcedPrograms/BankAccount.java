package AdavcedPrograms;

/**
 * Task is to make deposit and withdraw method as sychronized for therad safety.
 * try to remove synchronized from methods and see the difference.
 */

class BankAccount {
    private String accountNumber;    //encapsulation by making private
    private String holderName;       //encapsulation by making private
    private double balance;          //encapsulation by making private

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount,String thread) throws InterruptedException {
        if (amount > 0) {
            balance += amount;
            Thread.sleep(5000);
            System.out.println(thread + " Deposit: " + balance);
            balance = 0;
        }
    }

    public void withdraw(double amount,String thread) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(thread + " withdraw: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount("123","shubham",0);
        /*BankAccount bankAccount1 = new BankAccount("456","choulwar",400);
        bankAccount.deposit(bankAccount.getBalance());
        bankAccount1.deposit(bankAccount1.getBalance());*/

        Thread depositThread = new Thread(() -> {
            try {
                bankAccount.deposit(100,"Thread-1");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread depositThread1 = new Thread(() -> {
            try {
                bankAccount.deposit(200,"Thread-2");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        depositThread.start();
        depositThread.join();
        depositThread1.start();
        depositThread1.join();

        System.out.println("Program ends");



    }
}

