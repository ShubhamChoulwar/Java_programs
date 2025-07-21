package SortingUsingComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {
    /**
     * It allows natural ordering of objects based on their properties.
     * For instance, sorting a list of objects using their natural order.
     */

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");
        System.out.println("Original names: " + names);
        Collections.sort(names);
        System.out.println("Sorted names:" + names);
    }
}
