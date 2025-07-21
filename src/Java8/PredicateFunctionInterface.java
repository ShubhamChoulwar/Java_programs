package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;

/**
 * a Predicate is a functional interface in the java.util.function package.
 * It represents a boolean-valued function (i.e., it returns true or false).
 * Predicates are commonly used for filtering or matching conditions.
 */
public class PredicateFunctionInterface {

    public static void main(String args[]) {
        Logger logger = Logger.getLogger(Stream.class.getName());
        Predicate<Integer> isEven = number -> number %2 == 0;
        System.out.println(isEven.test(5));

        Predicate<String> isEmpty = str -> str.isEmpty();
        System.out.println(isEmpty.test("Hello"));

        // Using Predicate to negate the condition
        // Here, we create a new Predicate that checks if a string is not empty
        // by negating the isEmpty predicate.
        // This is useful for scenarios where you want to filter out empty strings.
        Predicate<String> isNotEmpty = isEmpty.negate();
        System.out.println(isNotEmpty.test("Hello"));

        // Using Predicate to combine conditions
        Predicate<String> startsWithH = str -> str.startsWith("H");
        System.out.println(startsWithH.test("Hello"));
        System.out.println(startsWithH.test("World"));
        Predicate<String> startsWithHAndNotEmpty = isNotEmpty.and(startsWithH);
        System.out.println(startsWithHAndNotEmpty.test("Hello"));
        System.out.println(startsWithHAndNotEmpty.test("World"));

        //call predicate using filter.

        Predicate<String> hasLength = word -> word.length() > 5;

        List<String> lengthCal = Arrays.asList("shubham","abc");
        List<String> calLength = lengthCal.stream().filter(hasLength)
                .map(c -> c.substring(0,1).toUpperCase()+c.substring(1)).toList();
        logger.info("length greater than 5: " + calLength);



    }
}
