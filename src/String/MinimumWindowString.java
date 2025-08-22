package String;

import java.util.logging.Logger;

/**
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
 *
 * The testcases will be generated such that the answer is unique.

 * Example 1:
 *
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 * Example 2:
 *
 * Input: s = "a", t = "a"
 * Output: "a"
 * Explanation: The entire string s is the minimum window.
 */

public class MinimumWindowString {

    public boolean chkMinimumWindow(String s){
         return true;
    }

    public static void main(String[] args){
        Logger logger = Logger.getLogger(String.valueOf(MinimumWindowString.class));
        MinimumWindowString minimumWindowString = new MinimumWindowString();
        Boolean result = minimumWindowString.chkMinimumWindow("ADOBECODEBANC");
        logger.info(String.valueOf(result));

    }
}
