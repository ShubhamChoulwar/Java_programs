package String;

import java.util.HashMap;

public class CollectNoOfCharInHashmap {
    public static void main(String[] args) {

        String str = "shubham";
        HashMap<String, Integer> result = new HashMap<>();

        for (char c : str.toCharArray()) {
            String key = String.valueOf(c);
            result.put(key, (result.getOrDefault(key, 0) + 1));
        }

        System.out.println("Duplicate character and count result");

        System.out.println(result);
    }

}
