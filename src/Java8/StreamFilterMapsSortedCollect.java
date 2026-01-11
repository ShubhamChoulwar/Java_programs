package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMapsSortedCollect {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "apricot", "orange");
        List<String> result = words.stream()
                .filter(w -> w.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
