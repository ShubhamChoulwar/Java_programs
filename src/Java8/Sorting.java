package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Sorting {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("shubham", "apple", "ball");
        List<Integer> id = Arrays.asList(1, 4, 5, 2, 3);
        Collections.sort(names);  //this collectin sort
        System.out.println("Sorted names by Collection sort: " + names);
        names.sort((a, b) -> a.compareTo(b));  //this is custom sort by comparator.
        System.out.println("Sorted names using custom sorting: " + names);

        //in case if we have object like int id and string name and based on this do sorting
        // example: objects with int id and String name and sorting by those fields
        List<Person> people = Arrays.asList(
                new Person(3, "Charlie"),
                new Person(1, "Alice"),
                new Person(2, "Bob")
        );
        System.out.println("Original people: " + people);

        // sort by id
        people.sort(Comparator.comparingInt(Person::getId));
        System.out.println("Sorted people by id: " + people);

        // sort by name
        people.sort(Comparator.comparing(Person::getName));
        System.out.println("Sorted people by name: " + people);
    }

    // simple POJO inside the same file for demonstration
    static class Person {
        private final int id;
        private final String name;

        Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        int getId() {
            return id;
        }

        String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
        }
    }
}

