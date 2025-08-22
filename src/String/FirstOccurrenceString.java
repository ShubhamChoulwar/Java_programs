package String;

/**
 * Example 1:
 *
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 *
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 *
 */

public class FirstOccurrenceString {

    public int findOccuranceAndFirstIndex(String haystack,String needle){

        if(haystack.contains(needle)){
            return 1;
        }
        return 0;
    }


    public static void main(String[] args){
        FirstOccurrenceString firstOccurrenceString = new FirstOccurrenceString();
        String haystack = "sadbut";
        String needle = "sad";
        int index = firstOccurrenceString.findOccuranceAndFirstIndex(haystack,needle);
        

    }
}
