package Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Stream {
    /**
     * This is a simple example of using Java 8 Streams.
     * Streams allow for functional-style operations on collections of objects.
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Stream.class.getName());
        // Example usage of streams would go here
        // For instance, filtering, mapping, and collecting data from a list
        // However, the actual implementation is not provided in this snippet
        System.out.println("This is a placeholder for Java 8 Stream example.");
        // You can create a list, convert it to a stream, and perform operations like:
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream()
                .filter(name -> name.startsWith("A"))
              .forEach(System.out::println);

        //even and odd elements
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> sortedList = numbers.stream().filter(num -> num%2==0).collect(Collectors.toList());
        logger.info("Sorted even numbers: " + sortedList);

        //square the sorted elements
        List<Integer> squareOfSorted = sortedList.stream().map(num -> num*num).toList();
        logger.info("square of sorted elements: " + squareOfSorted);

        //convert first character to Upper case from String
        List<String> smallWord = Arrays.asList("shubham","choulwar");
        List<String> resultWord = smallWord.stream().map(word -> word.substring(0,1).toUpperCase() + word.substring(1))
                .collect(Collectors.toList());
        logger.info("Upper case words: " + resultWord);

        //Filter out null or empty strings
        List<String> list = Arrays.asList("city","country",null);
        List<String> nullFreeList = list.stream().filter(w -> w != null).toList();
        logger.info("null value in list: " + nullFreeList);

        //Get lengths of names starting with "A"
        List<String> lengthList = Arrays.asList("Apple","Aeroplane");
        List<Integer> length = lengthList.stream().filter(e -> e.startsWith("A"))
                                                  .map(String::length).toList();

        logger.info("length of string starts with A: " + length);

        /*HashMap<String,Integer> valueLength = lengthList.stream().filter(e1 -> e1.startsWith("A"))
                .map( e1 -> new HashMap<>(e1, e1.length())).collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));*/
    }
}
