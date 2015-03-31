package com.leetcode.problem097.interleavingstring;

/**
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
 * 
 * For example, Given: s1 = "aabcc", s2 = "dbbca",
 * 
 * When s3 = "aadbbcbcac", return true. When s3 = "aadbbbaccc", return false.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (null == s1 && null == s2 && null == s3) {
            return true;
        }
        if (null == s1) {
            return s2.equals(s3);
        }
        if (null == s2) {
            return s1.endsWith(s3);
        }
        if (null == s3) {
            return false;
        }
        if (s3.length() != s1.length() + s2.length()) {
            return false;
        }
        return isInterleave(s1, 0, s2, 0, s3, 0);
    }

    private boolean isInterleave(String s1, int index1, String s2, int index2,
            String s3, int index3) {
        if (index1 == s1.length() && index2 == s2.length() && index3 == s3.length()) {
            return true;
        }

        boolean flag = false;
        if (index1 != s1.length() && s1.charAt(index1) == s3.charAt(index3)) {
            flag = flag || isInterleave(s1, index1 + 1, s2, index2, s3, index3 + 1);
        }
        if (index2 != s2.length() && s2.charAt(index2) == s3.charAt(index3)) {
            flag = flag || isInterleave(s1, index1, s2, index2 + 1, s3, index3 + 1);
        }
        return flag;
    }

}