package com.leetcode.problem014.longestcommonprefix;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (null == strs || 0 == strs.length) {
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (null == strs[i] || 0 == strs[i].length()) {
                return "";
            }
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            char c = 0;
            boolean same = true;
            for (int j = 0; j < strs.length; j++) {
                if (0 == j) {
                    c = strs[j].charAt(i);
                } else {
                    if (c != strs[j].charAt(i)) {
                        same = false;
                        break;
                    }
                }
            }
            if (same) {
                sb.append(c);
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
