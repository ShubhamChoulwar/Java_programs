package Practice_HashMap;

import java.util.HashMap;
import java.util.Map;

public class FindDupValue {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "One");
        map.put(4, "three");
        map.put(5, "two");

        // count frequency of values
        Map<String, Integer> valueCount = new HashMap<>();

        for (String value : map.values()) {
            valueCount.put(value, valueCount.getOrDefault(value, 0) + 1);
        }

        // print keys whose values are duplicate
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (valueCount.get(entry.getValue()) > 1) {
                System.out.println("Duplicate value key: " + entry.getKey() + entry.getValue());
            }
        }

        //using java 8

    }
}
