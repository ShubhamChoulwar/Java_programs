package practise_Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;

public class FindKeywith3rdHighestValue {

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a',500);
        map.put('b',300);
        map.put('c',700);
        map.put('d',700);
        map.put('e',500);
        map.put('f',300);
        map.put('g',200);
        map.put('h',500);
        map.put('I',200);

        try {
            Integer thirdHighestValue = map.values().stream()
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .skip(2)
                    .findFirst()
                    .orElse(null);
            map.entrySet().stream()
                    .filter(e -> e.getValue().equals(thirdHighestValue))
                    .forEach(e -> System.out.println(e.getKey()));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
