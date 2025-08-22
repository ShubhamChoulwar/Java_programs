package Array;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.

 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        try {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] + nums[i + 1] == target) {
                    return new int[]{i, i + 1};
                }
            }
            return new int[0];  //return empty array
        }
        catch (Exception e){
            System.out.println(e);
        }
        return new int[0];
    }
    public static void main(String[] args){
        Logger logger = Logger.getLogger(String.valueOf(TwoSum.class));
        int[] input = {2,7,11,15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
       int[] result =  twoSum.twoSum(input,target);
       logger.info(Arrays.toString(result));

    }
}
