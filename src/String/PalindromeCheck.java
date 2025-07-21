package String;

public class PalindromeCheck {

    public static void main(String[] args) {
        String name = "AAA";
        new PalindromeCheck().checkPalindromeUsingLoop(name);
        new PalindromeCheck().checkPalindromeUsingReverseMethod(name);
    }

    /**
     * This method is used to check the given word is palindrome or not using loop
     * @param name
     */
    public void checkPalindromeUsingLoop(String name){
        String convertWord = "";
        for(int i=name.length()-1;i>=0;i--){
            convertWord = convertWord + name.charAt(i);
        }
        if(name.equals(convertWord)){
            System.out.println("The given word is palindrome");
        }
        else{
            System.out.println("The given word is not palindrome");
        }
    }

    /**
     * This method is used to check the given word is palindrome using reverse method
     * @param name
     */
    public void checkPalindromeUsingReverseMethod(String name){
        StringBuilder convertWord = new StringBuilder(name);
        System.out.println(convertWord.reverse());
        if(name.equals(convertWord)){
            System.out.println("The given word is palindrome");
        }
        else{
            System.out.println("The given word is not palindrome");
        }
    }
}
