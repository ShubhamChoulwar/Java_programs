package practise_Java8;

import Java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//input = (1, 2, 3, 4, 5, 6)  //output = (2,4,6)
public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6);

        List result = lst.stream().filter(e -> e%2 == 0).toList();
        System.out.println(result);

    }
}
