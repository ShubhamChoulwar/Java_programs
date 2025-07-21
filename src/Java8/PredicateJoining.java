package Java8;

import java.util.function.Predicate;

/**
 * Predicate joining in Java 8 refers to combining multiple Predicate instances to create more complex logical
 * conditions.
 * Java 8's Predicate interface provides default methods like .and, .or, and .negate for this purpose.
 */
public class PredicateJoining {
    public static void main(String[] args){

        //creating predicate
        Predicate<Integer> isEven = number -> number %2 == 0;
        Predicate<Integer> isPositive = number -> number > 0;

        //calling predicate method for joining
        System.out.println(isEven.and(isPositive).test(5));
        System.out.println(isEven.or(isPositive).test(5));
    }

}
