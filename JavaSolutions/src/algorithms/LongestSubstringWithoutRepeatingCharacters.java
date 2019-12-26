package algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0, i = 0, j = 0;
        Set<Character> hashSet = new HashSet<>();
        int len = s.length();
        while (i < len && j < len) {
            if (hashSet.contains(s.charAt(j))) {
                hashSet.remove(s.charAt(i));
                i++;
            } else {
                hashSet.add(s.charAt(j));
                j++;
                maxLen = Math.max(maxLen, j - i);
            }
        }
        return maxLen;
    }
}
