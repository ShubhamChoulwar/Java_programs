package practise_String;

public class ReverseString {

    public void reverse(String name){
           StringBuilder str = new StringBuilder(name);
           str.reverse();
           System.out.println(str);
    }

    public static void main(String[] args) {
        String name = "shubham";
        new ReverseString().reverse(name);



    }
}
