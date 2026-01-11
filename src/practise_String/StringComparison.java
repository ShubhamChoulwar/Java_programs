package practise_String;

public class StringComparison {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("-----------------------------");
        String s4 = "Java";
        String s5 = "java";
        String s6 = new String("Java");
        String s7 = new String("java");

        System.out.println(s4 == s5);
        System.out.println(s4 == s6);
        System.out.println(s6.equals(s7));

    }
}
