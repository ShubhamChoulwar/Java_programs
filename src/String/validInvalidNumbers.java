package String;

/**
 * For example, all the following are valid numbers: "2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3",
 * "3e+7", "+6e-1", "53.5e93", "-123.456e789", while the following are not valid numbers: "abc", "1a", "1e",
 * "e3", "99e2.5", "--6", "-+3", "95a54e53".
 */

public class validInvalidNumbers {


   public boolean checkValidNum(String num){
       char first = num.charAt(0);
       if(Character.isDigit(first)){
           return true;
       }
       else if(first == '.' || first == '-'){
           return true;
       }
       return false;
   }

   public static void main(String [] args){
       validInvalidNumbers chkNum = new validInvalidNumbers();
        Boolean result = chkNum.checkValidNum("--1");
        System.out.println(result);
    }
}
