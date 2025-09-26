package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumofListReduceFunction {

    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(10,20,30,33,23);

        int result = lst.stream().reduce(0,(a, b) -> a+b);
        System.out.println("Sum of List : " + result);

        //sum of only even numbers
        int result1 = lst.stream().filter(a -> a%2==0).reduce(0,Integer::sum);
        System.out.println("Sum of even numbers : " + result1);
    }
}
