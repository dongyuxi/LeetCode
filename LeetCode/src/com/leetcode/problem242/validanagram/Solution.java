package com.leetcode.problem242.validanagram;

/**
 * Given two strings s and t, write a function to determine if t is an anagram
 * of s.
 * 
 * For example, s = "anagram", t = "nagaram", return true. s = "rat", t = "car",
 * return false.
 * 
 * Note: You may assume the string contains only lowercase alphabets.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (null == s && null == t) {
            return true;
        }
        if (null == s || null == t) {
            return false;
        }
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            tCount[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (sCount[i] != tCount[i]) {
                return false;
            }
        }
        return true;
    }
}
