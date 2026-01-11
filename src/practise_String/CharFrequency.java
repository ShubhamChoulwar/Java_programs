package practise_String;

import java.util.HashMap;

public class CharFrequency {
    public void countChar(String name){
        HashMap<Character, Integer> result = new HashMap<>();
        for(char ch : name.toCharArray()){
            result.put(ch, result.getOrDefault(ch, 0) + 1);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String name = "SHRAAVI";
        CharFrequency charFrequency = new CharFrequency();
        charFrequency.countChar(name);
    }
}
