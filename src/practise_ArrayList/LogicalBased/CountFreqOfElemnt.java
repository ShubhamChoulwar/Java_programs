package practise_ArrayList.LogicalBased;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFreqOfElemnt {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,12,12,10,13,1,9);

        //using traditional style
        Map<Integer,Integer> result = new HashMap<>();
        for(int num:list){
            result.put(num, result.getOrDefault(num,0)+1);
        }
        System.out.println(result);

        //using java8
        Map<Integer,Long> result1 = list.stream()
                                            .collect(Collectors.groupingBy(e -> e,Collectors.counting()));
        System.out.println(result1);

    }
}
