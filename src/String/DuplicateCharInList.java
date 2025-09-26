package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharInList {
    public static void main(String[] args) {
        //using java8
        List<String> names = Arrays.asList("A", "B", "A", "C", "B", "D");

        Set<String> seen = new HashSet<>();
        Set<String> duplicates = names.stream()
                .filter(name -> !seen.add(name)) // `add` returns false if already present
                .collect(Collectors.toSet());

        System.out.println("Duplicates: using java8:  " + duplicates);

        //using normal java
        int[] arr = {1, 3, 2, 4, 3, 5, 2};

        Set<Integer> seen1 = new HashSet<>();
        Set<Integer> duplicates1 = new HashSet<>();

        for (int num : arr) {
            if (!seen1.add(num)) {
                duplicates1.add(num);
            }
        }

        System.out.println("Duplicate numbers: using normal java:  " + duplicates);

        //another method
        int[] arr1 = {1, 3, 2, 4, 3, 5, 2};
        Set<Integer> seen2 = new HashSet<>();
        Set<Integer> duplicates2 = new HashSet<>();
        for(int r : arr1){
            if(seen2.contains(r)){
                duplicates2.add(r);
            }
            else{
                seen2.add(r);
            }
        }
        System.out.println("Duplicates : another method: " + duplicates2);
    }

}
