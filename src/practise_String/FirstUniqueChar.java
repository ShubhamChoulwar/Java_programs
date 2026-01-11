package practise_String;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

    public static void findUniqueChar(String name){
        HashMap<Character,Integer> result = new HashMap<>();
        for(char ch : name.toCharArray()){
            result.put(ch, result.getOrDefault(ch,0)+1);
        }
        System.out.println(result);
        for(Map.Entry<Character, Integer> entry : result.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
    public static void main(String[] args) {
        String name = "swiss";
        FirstUniqueChar.findUniqueChar(name);
    }
}
