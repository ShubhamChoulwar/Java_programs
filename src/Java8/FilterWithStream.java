package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//filter even numbers
public class FilterWithStream {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(10,25,46,23,30,26);

        List<Integer> result = num.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println("Filter even numbers with Stream function : " + result);
    }
}
