package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Sorting {

    public static void main(String[] args){

        List<String> names = Arrays.asList("shubham", "apple", "ball");
        List<Integer> id = Arrays.asList(1,4,5,2,3);
        Collections.sort(names);  //this collectin sort
        System.out.println("Sorted names by Collection sort: " + names);
        names.sort((a,b) -> a.compareTo(b));  //this is custom sort by comparator.
        System.out.println("Sorted names using custom sorting: " + names);

    }
}
