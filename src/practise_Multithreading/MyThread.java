package practise_Multithreading;

public class MyThread{

    public int addition(int num1,int num2){
        return num1+num2;
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread m1 = new MyThread();

        Runnable task1 = () -> {
            for (int i = 1; i <= 5; i++) {
                int result = m1.addition(i, i + 1);
                System.out.println(Thread.currentThread().getName() + " -> " + result);
            }
        };

        Runnable task2 = () -> {
            for (int i = 6; i <= 9; i++) {
                int result = m1.addition(i, i + 1);
                System.out.println(Thread.currentThread().getName() + " -> " + result);
            }
        };
        Thread myThread = new Thread(task1,"Thread.1");
        Thread myThread1 = new Thread(task2, "Thread.2");
        myThread.start();
        myThread1.start();
    }

}
