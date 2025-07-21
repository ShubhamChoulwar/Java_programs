package String;

/**
 * This program is used to demonstrate the multiple string variable and there memory location and objects
 */

public class MultipleaStringVariable {

    public static void main(String[] args) {

        String name = new String("shubham");
        String name1 = new String("shubham");
        String name2 = "shubham";

        System.out.println(name.equals(name1)); //True - comparing the value
        System.out.println(name == name1); //False - comparing the memory location
        System.out.println(name1 == name2); //False - comparing the memory location
        System.out.println(name1.equals(name2)); //True - comparing the value
    }
}
