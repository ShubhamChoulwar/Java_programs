package practise_String;

import static java.util.Arrays.stream;

public class PalindromeString {

    public void check(String name){
       StringBuilder str = new  StringBuilder(name);
       str.reverse();
       String str1 = str.toString();
       Boolean result = str1.equals(name) ? true:false;
       System.out.println(result);
       }
    public static void main(String[] args) {
        String name = "AAA";
        PalindromeString palindromeString = new PalindromeString();
        palindromeString.check(name);
    }
}
