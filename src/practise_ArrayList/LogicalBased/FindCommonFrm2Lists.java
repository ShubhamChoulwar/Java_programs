package practise_ArrayList.LogicalBased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonFrm2Lists {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(6,7,8,1,2);
        List<Integer> result = new ArrayList<>();

        //traditional way
        for(int num: list1){
            if(list2.contains(num)){
                result.add(num);
            }
        }
        System.out.println(result);

        //using java8
        List<Integer> result1 = list1.stream()
                .filter(list2::contains).toList();
        System.out.println(result1);
    }
}
