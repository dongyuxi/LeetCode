package com.leetcode.problem001.wordbreak;

import java.util.Set;

public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        if (null == s || 0 == s.length()) {
            return true;
        }
        if (null == dict) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (dict.contains(sb.toString())) {
                result = true;
                sb.delete(0, sb.length());
            } else {
                result = false;
            }
        }
        return result;
    }
}