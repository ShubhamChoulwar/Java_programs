package Array;

import java.util.Arrays;

/**
 *java program that have values in array like 1,2,3,4 and want to get output like 24,12,8,6 how we will write java program?
 */

public class MultiplyAllWithCurrentIndex {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int totalProduct =1;
        for(int num : arr){
            totalProduct *= num;
        }
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            result[i] = totalProduct/arr[i];
        }
        for(int rst : result){
            System.out.println(rst);
        }

        /**
         * using java8
         */

            int totalProductJava8 = Arrays.stream(arr)
                                           .reduce(1, (a,b) -> a * b);

            int[] resultJava8 = Arrays.stream(arr).map(x -> totalProductJava8/x).toArray();
            System.out.println(Arrays.toString(resultJava8));
    }
}
