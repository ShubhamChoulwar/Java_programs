package practise_Arrays;

import Java8.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

//input = {1, 2, 3, 4, 5} output =
public class ReverseArray {
    public static void reverse(int[] arr){
        //using java8
        int[] result = IntStream.range(0,arr.length)
                        .map(i -> arr[arr.length-i-1])
                        .toArray();
        System.out.println("Reversed array : " + Arrays.toString(result));

        //using collection
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
    }
}
