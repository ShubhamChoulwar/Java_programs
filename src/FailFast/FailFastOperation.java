package FailFast;

public class FailFastOperation {
    /**

     * It shows how modifying a collection while iterating over it can lead to a ConcurrentModificationException.
     * This is known as fail-fast behavior, where the iterator detects that the collection has been modified
     * and throws an exception to prevent unpredictable behavior.
     * Fail-fast iterators are designed to throw a ConcurrentModificationException
     * if they detect that the collection has been modified structurally
     * (e.g., adding or removing elements) after the iterator was created.
     * This behavior helps to avoid issues that can arise from concurrent modifications
     * to the collection while iterating over it.
     * Fail-fast iterators are commonly used in Java collections,
     * such as ArrayList, HashMap, and others,
     */
    public static void main(String[] args) {
        // Example of fail-fast behavior
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Using an iterator to traverse the list
        java.util.Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            // Uncommenting the next line will cause a ConcurrentModificationException
            list.remove(element); // This will cause fail-fast behavior
        }

    }
}
