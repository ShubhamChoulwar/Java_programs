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
        /*CompletableFuture completableFuture = CompletableFuture.supplyAsync(() -> {
            int result = calculateTax(1000, 20);
        }).thenApply(success()).thenAccept(System.out::println);*/
    }
}
