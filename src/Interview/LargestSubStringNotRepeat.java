package Interview;

import java.util.HashSet;
import java.util.Set;

//input = abcdefabclmnoabcd
// output = lmno
public class LargestSubStringNotRepeat {
    public static void findSubString(String str){
        int left = 0;
        int maxLength = 0;
        int firstIndex = 0;
        Set<Character> set = new HashSet<>();

        for(int i=0;i<str.length();i++){
            char currentchar = str.charAt(i);
            while(set.contains(currentchar)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(currentchar);
            if(i-left+1 > maxLength){
                maxLength = i-left+1;
                firstIndex = left;

            }
        }
        System.out.println(str.substring(firstIndex,firstIndex+maxLength));
    }
    public static void main(String[] args) {
        String str = "abcdefabclmnoabcd";
        findSubString(str);
    }

}
