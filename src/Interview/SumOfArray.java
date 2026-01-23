package Interview;


import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int sum = 6;
        Set<Integer> seenNum = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int value = sum-arr[i];
            if(seenNum.contains(value)){
                System.out.println("result : " + arr[i] + "," + value);
            }
            seenNum.add(arr[i]);
        }

        //using java8
        List<List<Integer>> list = java.util.stream.IntStream.range(0, arr.length)
                .boxed()
                .flatMap(i -> java.util.stream.IntStream.range(i + 1, arr.length)
                        .filter(j -> arr[i] + arr[j] == sum)
                        .mapToObj(j -> java.util.Arrays.asList(arr[i], arr[j])))
                .toList();
        System.out.println("result using java8: " + list);

    }
}
