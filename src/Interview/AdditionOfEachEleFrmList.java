package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * input list = {1,2,3,4,6}
 * output list = {1,3,6,10,16}
 */

public class AdditionOfEachEleFrmList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 6);

        //using java8
        List<Integer> result1 = list.stream()
                .map(i -> IntStream.rangeClosed(0, list.indexOf(i))
                        .map(list::get)
                        .sum())
                .collect(Collectors.toList());
        System.out.println(result1);

        //using java8 - alternative
        final int[] sum = {0};
        List<Integer> result2 = list.stream()
                .map(i -> sum[0] += i)
                .collect(Collectors.toList());
        System.out.println(result2);

        //uisng traditional way
        List<Integer> result3 = new ArrayList<>();
        int sum1=0;
        for(int num:list){
            sum1+=num;
            result3.add(sum1);
        }
        System.out.println(result3);

        //if input is an array then
        int[] arr = {1,2,3,4,6};
        int[] result4 = new int[arr.length];
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum2+=arr[i];
            result4[i]=sum2;
    }
        System.out.println(Arrays.toString(result4));
    }





}
