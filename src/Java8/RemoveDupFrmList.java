package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDupFrmList {


    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,2,3,4,4);
        Set<Integer> set = new HashSet<>();
        set = lst.stream().distinct().collect(Collectors.toSet());  //remove duplicate and print distinct
        System.out.println(set);

        List<Integer> lst1 = Arrays.asList(1,2,2,3,4,4);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = lst1.stream().filter(num -> !set1.add(num)).collect(Collectors.toSet());
        System.out.println(set2);

    }


}
