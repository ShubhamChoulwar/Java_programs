package Java8;

import java.util.function.BiFunction;
import java.util.function.Function;
/**
 * Function is a functional interface which takes one argument and produces a result.
 */

public class FunctionExample {

    public static void main(String args[]) {
        //Function to find the square of a number
        Function<Integer,Integer> square = a -> a * a;
        System.out.println(square.apply(4));

        //Function to convert a string to uppercase
        Function<String,String> toUpperCase = str -> str.toUpperCase();
        System.out.println(toUpperCase.apply("hello"));

        //Function to concatenate two strings
        Function<String, String> concatenate = str -> str + " World";
        System.out.println(concatenate.apply("Hello"));

        //BiFunction to concatenate two strings
        BiFunction<String, String, String> concatenate2 = (str1, str2) -> str1 + str2;
        System.out.println(concatenate2.apply("Hello", " World"));

        //Function to find the length of a string
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println(stringLength.apply("Hello World"));
    }
}
