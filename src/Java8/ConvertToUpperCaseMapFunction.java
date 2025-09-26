package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCaseMapFunction {

    public static void main(String[] args) {
        String str = "shubham";

        String result = str.toUpperCase();
        System.out.println("string uppercase: " + result);

        //list
        List<String> lst = Arrays.asList("shubham","choulwar");
        List<String> result1 = lst.stream().map(String :: toUpperCase).collect(Collectors.toList());
        System.out.println("string uppercase of list using stream : " + result1);

        List<String> result2 = lst.stream().map(a -> a.substring(0,1).toUpperCase() + a.substring(1)).collect(Collectors.toList());
        System.out.println("only first char to uppercase : " + result2);

    }
}
