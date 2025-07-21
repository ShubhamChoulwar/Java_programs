package Asynchronous;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsynchronousMethod {
    /**
     * This method simulates an asynchronous operation.
     * It prints a message indicating that the operation is starting,
     * then sleeps for 2 seconds to simulate a delay,
     * and finally prints a message indicating that the operation has completed.
     */
    public void performAsyncOperation() {
        System.out.println("Starting asynchronous operation...");
        try {
            // Simulating a delay of 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Operation was interrupted: " + e.getMessage());
        }
        System.out.println("Asynchronous operation completed.");
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AsynchronousMethod asyncMethod = new AsynchronousMethod();
        asyncMethod.performAsyncOperation();

        // Start both tasks asynchronously
        CompletableFuture<String> userFuture = asyncMethod.getUserDataAsync();
        CompletableFuture<String> orderFuture = asyncMethod.getOrderHistoryAsync();

        // Combine both when done
        CompletableFuture<String> combinedFuture = userFuture.thenCombine(orderFuture, (user, orders) -> {
            return "User Info: " + user + "\nOrder History: " + orders;
        });

        // Print result
        System.out.println("Fetching data...");
        System.out.println(combinedFuture.get());  // Waits for both tasks to complete
    }

    public CompletableFuture<String> getUserDataAsync() {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay("Fetching user data");
            return "John Doe, Age 30";
        });
    }

    public CompletableFuture<String> getOrderHistoryAsync() {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay("Fetching order history");
            return "Order#1234, Order#5678";
        });
    }

    private void simulateDelay(String task) {
        try {
            System.out.println(task + "...");
            Thread.sleep(2000);  // Simulate delay (2 seconds)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    }


