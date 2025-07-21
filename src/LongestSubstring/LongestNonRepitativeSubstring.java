package LongestSubstring;

public class LongestNonRepitativeSubstring {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        int[] charIndex = new int[256]; // ASCII character set

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (charIndex[currentChar] > start) {
                start = charIndex[currentChar];
            }
            charIndex[currentChar] = end + 1; // Store the next index of the character
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;

    }
}
