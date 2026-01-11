package practise_Arrays;
//input = {4, 2, 9, 1, 7}   //output = Min:1, max:9
public class MinMaxArray {
    public static void findMinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for(int num : arr){
            if(num < min) min = num;
            if(num > max) max = num;
        }
        System.out.println("Min : " + min + " , " + "Max : " + max);
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 7};
        findMinMax(arr);
    }
}
