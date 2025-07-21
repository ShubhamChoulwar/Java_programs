package Java8;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierExample {
    /**
     * This is a simple example of using a Supplier in Java 8.
     * A Supplier is a functional interface that represents a supplier of results.
     * It has a single method get() that returns a value.
     */
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();

        // Supplier: generates unique user ID
        Supplier<String> idGenerator = () -> UUID.randomUUID().toString();

        // Consumer: logs user creation
        //Consumer<String> logger = user -> System.out.println("User created: " + user);
        String userId = idGenerator.get();
        users.add(userId);
        System.out.println("Generated User ID: " + userId);
    }

}
