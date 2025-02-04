package Java8;

import java.util.function.Function;
/**
 * Function is a functional interface which takes one argument and produces a result.
 */

public class FunctionExample {

    public static void main(String args[]) {
        //Function to find the square of a number
        Function<Integer,Integer> square = a -> a * a;
        System.out.println(square.apply(4));
    }
}
