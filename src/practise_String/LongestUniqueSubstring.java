package practise_String;

import java.util.ArrayList;

public class LongestUniqueSubstring {

    public void lengthOfLongestSubstring(String name){
        ArrayList<Character> result = new ArrayList<>();
        int left = 0;
        for(int i=0; i<=name.length();i++){
            while(result.contains(name.charAt(i))){
                result.remove(name.charAt(left++));
            }
            result.add(name.charAt(i));
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String name = "abcabcbb";
        LongestUniqueSubstring longestUniqueSubstring = new LongestUniqueSubstring();
        longestUniqueSubstring.lengthOfLongestSubstring(name);
    }
}
