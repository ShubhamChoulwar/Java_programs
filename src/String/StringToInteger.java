package String;

public class StringToInteger {

    public int IntergerConvert(String s){
        StringBuilder strB = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '-' || s.charAt(i) == ' ' || (!Character.isDigit(s.charAt(i))) ) {
                continue;
            }
            strB.append(s.charAt(i));
        }
        int result = Integer.parseInt(String.valueOf(strB));
        return result;
    }

    public static void main(String[] args){
        String input = "-2A34";
        StringToInteger stringToInteger = new StringToInteger();
        int result = stringToInteger.IntergerConvert(input);
        System.out.println(result);
    }
}
