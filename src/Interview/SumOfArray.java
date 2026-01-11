package Interview;


import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class SumOfArray {
    public static void findSum(int[] arr, int sum){
        //int[][] result = new Array[arr.length];
        Set<Integer> seenNum = new HashSet<>();
        //int value=0;
        for(int i=0;i<arr.length;i++){
           int value = sum-arr[i];
            if(seenNum.contains(value)){
                System.out.println("result : " + arr[i] + "," + value);

            }
            seenNum.add(arr[i]);
            //System.out.println(arr[i]);
        }

    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int sum = 6;
        findSum(arr,sum);

    }
}
