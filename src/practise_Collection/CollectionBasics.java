package practise_Collection;

import java.util.*;

//List vs Set vs Map (Basic Iteration)
public class CollectionBasics {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "A");
        Set<String> set = new HashSet<>(list);
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "shubham");
        map.put(2, "shraavi");

        //Iterating List- using Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        //Iterating set

        //Iterating Map
        for (Map.Entry<Integer, String> mp : map.entrySet()) {
            System.out.println(mp.getKey() + "->" + mp.getValue());
        }
    }
}
