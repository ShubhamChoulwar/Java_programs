package Collections;
/**
 * Thread-safe collections are data structures that are designed to be safely accessed and modified by multiple threads concurrently.
 * They provide mechanisms to ensure that operations on the collection are atomic and consistent, preventing
 * In Java, thread-safe collections are those that can be safely used by multiple threads concurrently without
 * external synchronization.
 * ------------------------------------------------------------------------------------------
 * Collection Type	         Thread-Safe Class
 * List	                     Vector, Stack
 * Map	                     Hashtable
 * These are synchronized internally.
 * -------------------------------------------------------------------------------------------
 */
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeCollections {
    public static void main(String[] args){
    /**
     *  1. Legacy Thread-Safe Collections
     */
    List<String> list = new Vector<>();
    Map<String, String> map = new Hashtable<>();

    /**
     * 2. Using Collections.synchronizedX() Wrappers
     */
    List<Integer> syncList = Collections.synchronizedList(new ArrayList<>(Arrays.asList(1,2,3,4)));
    Map<String, String> syncMap = Collections.synchronizedMap(new HashMap<>());
    Set<String> syncSet = Collections.synchronizedSet(new HashSet<>());

      System.out.println(syncList);
        syncList.add(5);
        System.out.println(syncList);

        /**
         *  3. CopyOnWriteArrayList
          */
        CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<>();
        cowList.add("A");
        cowList.add("B");
        cowList.add("C");
        System.out.println("CopyOnWriteArrayList: " + cowList);
        // Modifying the list while iterating
        for (String item : cowList) {
            System.out.println("Item: " + item);
            if (item.equals("B")) {
                cowList.add("D"); // This won't affect the iteration
            }
        }
        System.out.println("After modification: " + cowList);

        /**
         * 4. ConcurrentHashMap
         */
        Map<String, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("A", "Apple");
        concurrentMap.put("B", "Banana");
        concurrentMap.put("C", "Cherry");
        System.out.println("ConcurrentHashMap: " + concurrentMap);
        // Concurrently modifying the map
        concurrentMap.put("D", "Date");
        concurrentMap.put("E", "Elderberry");
        System.out.println("After modification: " + concurrentMap);
        // Iterating over the map
        for (Map.Entry<String, String> entry : concurrentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        /**
         * 5. ConcurrentSkipListMap
         */
        Map<String, String> skipListMap = new ConcurrentSkipListMap<>();
        skipListMap.put("A", "Apple");
        skipListMap.put("B", "Banana");
        skipListMap.put("C", "Cherry");
        System.out.println("ConcurrentSkipListMap: " + skipListMap);
        // Concurrently modifying the map
        skipListMap.put("D", "Date");
        skipListMap.put("E", "Elderberry");
        System.out.println("After modification: " + skipListMap);
        // Iterating over the map
        for (Map.Entry<String, String> entry : skipListMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /**
         * 6. ConcurrentSkipListSet
         */
        Set<String> skipListSet = new ConcurrentSkipListSet<>();
        skipListSet.add("A");
        skipListSet.add("B");
        skipListSet.add("C");
        System.out.println("ConcurrentSkipListSet: " + skipListSet);
        // Concurrently modifying the set
        skipListSet.add("D");
        skipListSet.add("E");
        System.out.println("After modification: " + skipListSet);
        // Iterating over the set
        for (String item : skipListSet) {
            System.out.println("Item: " + item);
        }

    }
}