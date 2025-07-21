package String;

public class StringReversal {

    public static void main(String[] args) {
        String name = "Hello Pune";
        new StringReversal().reverseString(name);  //calling the method without creating the object.
        StringReversal str = new StringReversal(); //creating the object for calling nonstatic method.
        str.reverseUsingLoop(name);                   //calling method by creating the object
        reverseString(name);                       //calling the method without creating the object for static method.this will not work if method is not static


    }

    public static void reverseString(String name) {
        StringBuilder reverseString = new StringBuilder(name);
        System.out.println("using reverse method:" + reverseString.reverse());
    }

    public void reverseUsingLoop(String name) {
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println("using for loop:" + reverse);
    }
}
