package practise_Multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class ExecutorServiceClass {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        java.util.concurrent.ExecutorService executor = Executors.newFixedThreadPool(3);
        long startTime = System.currentTimeMillis();
        for(int i=0;i<=10;i++){
            int id = i;
            executor.submit(() ->
            System.out.println("Result of " + lst.get(id) + " = " + lst.get(id)*lst.get(id) + " by thread " + Thread.currentThread()));
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("Total time of execution " + (System.currentTimeMillis()-startTime));
    }
}
