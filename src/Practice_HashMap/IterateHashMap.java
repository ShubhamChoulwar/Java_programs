package Practice_HashMap;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        //1. entryset
        for(Map.Entry<Integer, String> mp: map.entrySet()){
            System.out.println(mp.getKey() + "->" + mp.getValue());
        }

        //2.keyset
        for(int key : map.keySet()){
            System.out.println(key + ":" + map.get(key));
        }

        //3.values
        for(String value:map.values()){
            System.out.println(value);
        }
    }
}
