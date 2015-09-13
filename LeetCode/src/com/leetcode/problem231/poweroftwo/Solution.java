package com.leetcode.problem231.poweroftwo;

/**
 * Given an integer, write a function to determine if it is a power of two.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        int cnt = 0;
        while (n >= 1) {
            cnt += n & 1;
            n >>= 1;
        }
        return cnt == 1;
    }
}
