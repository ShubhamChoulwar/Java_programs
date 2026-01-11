package practise_Arrays;

import java.util.HashSet;

//input = {2, 7, 11, 15} input = 9  output = {2,7}
public class PairWithSum {
    public static void findPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("Pair found: " + num + ", " + complement);
                return;
            }
            set.add(num);
        }
        System.out.println("No pair found");
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 11, 15};
        findPair(arr, 9);
    }
}
