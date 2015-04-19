package com.leetcode.problem003.longestsubstringwithoutrepeatingcharacters;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating
 * characters. For example, the longest substring without repeating letters for
 * "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring
 * is "b", with the length of 1.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (null == s || 0 == s.length()) {
            return 0;
        }
        Set<Character> visited = new HashSet<Character>();
        int start = 0;
        int end = 1;
        int max = 1;
        visited.add(s.charAt(start));
        while (end < s.length()) {
            if (visited.contains(s.charAt(end))) {
                max = Integer.max(max, (end - start));
                while (start < end && s.charAt(start) != s.charAt(end)) {
                    visited.remove(s.charAt(start));
                    start++;
                }
                if (start != end) {
                    start++;
                }
            } else {
                visited.add(s.charAt(end));
            }
            end++;
        }
        max = Integer.max(max, end - start);
        return max;
    }
}
