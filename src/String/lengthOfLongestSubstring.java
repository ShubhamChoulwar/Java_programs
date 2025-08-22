package String;

import java.util.ArrayList;
import java.util.logging.Logger;

public class lengthOfLongestSubstring {

    public void findLengthOfLongestSubstring(String s){
        ArrayList result = new ArrayList();
     for(int i=0;i<s.length();i++) {
         char chk = s.charAt(i);
         if (!result.contains(chk)) {
             result.add(chk);
         } else {
             
             break;

         }
     }
     System.out.println("Result: " +result);
    }

    public static void main(String [] args){
        String s = "abcabcbb";
        Logger logger = Logger.getLogger(String.valueOf(lengthOfLongestSubstring.class));
        lengthOfLongestSubstring a = new lengthOfLongestSubstring();
       a.findLengthOfLongestSubstring(s);
        //logger.info("length:" + i);
    }

}
