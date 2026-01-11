package Java8.FunctionalInterface;

public class Test {
    public static void main(String[] args) {

        Greeting g = n -> System.out.println ("Hello " + n);
        g.sayHello("Shubham");
    }

}
