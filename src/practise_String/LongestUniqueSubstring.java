package practise_String;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {

    public void lengthOfLongestSubstring(String name){
        Set<Character> result = new HashSet<>();
        int left = 0;
        for(int i=0; i<name.length();i++){
            while(result.contains(name.charAt(i))){
                break;
            }
            result.add(name.charAt(i));
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String name = "abcdeabcbb";
        LongestUniqueSubstring longestUniqueSubstring = new LongestUniqueSubstring();
        longestUniqueSubstring.lengthOfLongestSubstring(name);
    }
}
