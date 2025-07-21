package Java8;

import java.util.function.Consumer;

/**
 * In Java 8, the Consumer interface represents an operation that accepts a single input and returns no result.
 * A key feature of the Consumer interface is its ability to chain multiple Consumer operations using the andThen
 * method.
 */
public class ConsumerChaining {

    public static void main(String[] args){
        Consumer<Integer> consumer1 = a -> System.out.println("Consumer1: " + a);
        Consumer<Integer> consumer2 = a -> System.out.println("Consumer2: " + a);
        Consumer<Integer> consumer3 = a -> System.out.println("Consumer3: " + a);
        Consumer<Integer> consumer4 = a -> System.out.println("Consumer4: " + a);
        consumer1.andThen(consumer2).andThen(consumer3).andThen(consumer4).accept(10);
    }
}
