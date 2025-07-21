package SortingUsingComparatorAndComparable;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import static java.util.Collections.sort;

public class Comparator {
    /**
     * This class demonstrates the use of Comparator in Java.
     * It allows custom sorting of objects based on specific criteria.
     */

    public static void main(String[] args) {
        /**
         * 1. Create a list of object and sort them using a custom comparator.
         * For instance, sorting a list of objects using a custom comparator
         */
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        //using compare method to sort the list by age
        sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        System.out.println("Sorted people by age: " + people);
        /**
         * 2. Create a collection of objects and sort them using a custom comparator.
         * For instance, sorting a collection of objects using a custom comparator
         */
        Collection<Person> personCollection = new ArrayList<>(people);
        List<Person> personList = new ArrayList<>(personCollection);
        sort(personList, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("Sorted people by name: " + personList);
    }

}

