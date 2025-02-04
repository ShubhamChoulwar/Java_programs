package Java8;

import java.util.function.Consumer;

/*
* Consumer is a functional interface which represents a function that accepts a single input argument and returns no result.
 */
public class ConsumerExample {

    public static void main(String args[]) {

        // Consumer to display a number
        Consumer<Integer> display = a -> System.out.println(a);

        // Implement display using accept()
        display.accept(10);

           }
}
