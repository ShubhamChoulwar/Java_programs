package MultiThreading.executorFramework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *here used executor framework to execute factorial method so everything will be doing by executore framework
 * no need to create thread then call run method nothing as below.
 */
public class MainWithExecutorFramework {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(9);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                long result = 0;
                try {
                    result = factorial(finalI);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " : " + result);
            });
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
       executor.shutdown();
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
