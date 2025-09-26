package Java8;

import java.util.Arrays;
import java.util.List;

public class IteratingList {

    public static void main(String[] args){

        List<Integer> newList = Arrays.asList(1,2,3,4,5);

        newList.forEach(num -> System.out.println(num));
    }
}
