package String;

import java.util.Arrays;
import java.util.Scanner;

public class CheckTwoStringHaveSameLetters {

    public static boolean checkStrings(String a, String b){
        if(a.length()!=b.length()) {
            return false;
        }

        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);



      return Arrays.equals(arr1,arr2);
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        CheckTwoStringHaveSameLetters checkTwoStringHaveSameLetters = new CheckTwoStringHaveSameLetters();
        boolean result = checkTwoStringHaveSameLetters.checkStrings(a,b);
        //boolean result = CheckTwoStringHaveSameLetters.checkStrings(a,b);
        System.out.println(result);


    }
}
