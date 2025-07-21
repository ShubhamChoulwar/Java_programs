package FailSafe;

public class FailSafeOpeation {
    /**
     * This class demonstrates the fail-safe operation in Java.
     * Fail-safe iterators do not throw ConcurrentModificationException
     * when the collection is modified during iteration.
     * Instead, they work on a copy of the collection.
     */
    public static void main(String[] args) {
        // Example usage of fail-safe operation can be implemented here
        // For instance, using CopyOnWriteArrayList or similar collections
        java.util.List<String> list = new java.util.concurrent.CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        // Using an iterator to traverse the list
        java.util.Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            // Modifying the list during iteration
            list.add("D"); // This will not cause ConcurrentModificationException
        }
    }

}
