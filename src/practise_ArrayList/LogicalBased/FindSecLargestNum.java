package practise_ArrayList.LogicalBased;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecLargestNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,12,34,67,13,1,9);

        //using traditional way
        Collections.sort(list);
        System.out.println(list.get(list.size()-2));

        //using java8
        List<Integer> list1 = Arrays.asList(10,12,34,67,13,1,9);
        int num = list1.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(num);

    }
}
