package practise_String;

import java.util.ArrayList;
import java.util.List;

public class FindIndexOfPatternABC {
    public static void main(String[] args) {

        String source = "abcxyzabcxyzpqrxyzabcxyz";
        String pattern = "abc";
        List<Integer> result1 = new ArrayList<>();
        int index = source.indexOf(pattern);

        while(index!=-1){
            result1.add(index);
            index = source.indexOf(pattern,index+1);
        }
        System.out.println(result1);

        //without indexof method
        int n = source.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (source.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
