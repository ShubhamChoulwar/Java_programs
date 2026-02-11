package practise_Java8;

import java.util.Arrays;
import java.util.List;

public class UppercaseStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "spring", "docker");

        List<String> result = names.stream().map(String::toUpperCase).toList();
        System.out.println(result);
    }
}
