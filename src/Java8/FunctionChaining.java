package Java8;

import java.util.function.Function;

/**
 * Function chaining in Java 8 allows you to combine multiple functions to create more complex operations.
 * The Function interface in java.util.function provides two default methods to enable chaining:
 *
 * andThen – Executes the current function first, then applies another function.
 *
 * compose – Executes another function first, then applies the current function.
 */
public class FunctionChaining {
    public static void main(String[] args){

        Function<Integer,Integer> addition = i -> {
            return i + i;
        };

        Function<Integer,Integer> multiply = i -> {
            return i*i;
        };
        System.out.println(addition.apply(4));
        System.out.println(addition.andThen(multiply).apply(5));
    }

}
