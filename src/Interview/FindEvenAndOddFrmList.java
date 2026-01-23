package Interview;

import java.util.List;
import java.util.stream.IntStream.*;

/**
 * input list = {1,2,3,4,6,5}
 * output ={even{2,4,6},Odd{3,5}}
 */

public class FindEvenAndOddFrmList {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,6,5};
        StringBuilder even = new StringBuilder("Even Numbers: ");
        StringBuilder odd = new StringBuilder("Odd Numbers: ");

        for(int num : arr){
            if(num % 2 == 0){
                even.append(num).append(" ");
            } else {
                odd.append(num).append(" ");
            }
        }

        System.out.println(even.toString().trim());
        System.out.println(odd.toString().trim());
    }

    private Integer[] arr1 = {1,2,3,4,6,5};
    //using java8
    List<List<Integer>> result = java.util.stream.IntStream.range(0, arr1.length)
            .boxed()
            .collect(java.util.stream.Collectors.partitioningBy(i -> arr1[i] % 2 == 0))
            .values()
            .stream()
            .map(list -> list.stream().map(i -> arr1[i]).toList())
            .toList();
}
