package MultiThreading.executorFramework;

/**
 * This one trying to find factorial of 1 to 10 number by looping using main thread and it will take 9 seconds to execute.
 * in another class MainWithMultiThreads it will take just 1 secods to execute due to multiple threads running concurrently
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        for(int i=1;i<10;i++) {
            System.out.println(factorial(i));
        }
        System.out.println("Total time: " + (System.currentTimeMillis()-startTime));
    }

    public static long factorial(int number) throws InterruptedException {
        Thread.sleep(1000);
        long result = 1;
        for(int i=1;i<=number;i++){
            result *= i;
        }
        return result;
    }
}
