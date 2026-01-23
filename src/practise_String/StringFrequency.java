package practise_String;

import java.util.ArrayList;
import java.util.List;

public class StringFrequency {

    public static void checkPatternFreq(String str, String pattern){
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<=str.length();i++){
           String test =  str.substring(i,i+(pattern.length()));
            if(str.substring(i,i+(pattern.length())).equals(pattern)){
                lst.add(i);
               i= i+pattern.length()-1;
            }
        }
        System.out.println(lst);
    }

    public static void main(String[] args) {
        String str = "abcxyzabcxyzpqrxyzabcxyz";
        String pattern = "abc";
        checkPatternFreq(str,pattern);

    }
}
