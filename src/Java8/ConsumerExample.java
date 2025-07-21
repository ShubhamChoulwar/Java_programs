package Java8;

import java.util.function.Consumer;

/*
* In Java 8, the Consumer interface is a functional interface in the java.util.function package.
* It represents an operation that accepts a single input argument and returns no result.
* It's typically used for operations that perform side effects, like printing values, modifying objects,
* or updating external states
 */
public class ConsumerExample {

    public static void main(String args[]) {

        // Consumer to display a number
        Consumer<Integer> display = a -> System.out.println("The number is: " + a);

        // Implement display using accept()
        display.accept(10);

        // Consumer to display a number with a message
        Consumer<Integer> displayWithMessage = a -> System.out.println("The number is: " + a);
        // Implement displayWithMessage using accept()
        displayWithMessage.accept(20);

    }
}
