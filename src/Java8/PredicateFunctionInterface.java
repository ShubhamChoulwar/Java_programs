package Java8;

import java.util.function.Predicate;

/**
 * the predicate function interface is used to testing a condition
 */
public class PredicateFunctionInterface {

    public static void main(String args[]) {

        Predicate<Integer> isEven = number -> number %2 == 0;
        System.out.println(isEven.test(4));

    }
}
