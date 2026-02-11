package practise_Multithreading.CompletableFutureWithOneThread;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

    public static int calculateTax(int value, int tax){

        return (value * tax)/100;
    }

    public static void success(){
        System.out.println("message ready to send");
    }

    public static void main(String[] args) {
        CompletableFuture completableFuture = CompletableFuture.supplyAsync(() -> {
            return calculateTax(1000, 20);
        });
        completableFuture.thenApply(result -> {
            System.out.println("Tax Calculated " + result);
            return result;}).thenRun(() -> success());

        completableFuture.join();


    }
}
