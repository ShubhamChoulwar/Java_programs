package practise_Java8;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.list;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 3);
        Set<Integer> duplicates = list.stream()
                .filter(e -> Collections.frequency(list, e) > 1)
                .collect(Collectors.toSet());
        System.out.println(duplicates);

        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates1 = list.stream()
                .filter(e -> !seen.add(e))
                .collect(Collectors.toSet());
        System.out.println(duplicates1);
    }

    }
