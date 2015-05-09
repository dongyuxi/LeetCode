package com.leetcode.problem137.singlenumberii;

/**
 * Given an array of integers, every element appears three times except for one.
 * Find that single one.
 * 
 * Note: Your algorithm should have a linear runtime complexity. Could you
 * implement it without using extra memory?
 * 
 * @author dongyuxi
 * 
 */
public class Solution {
    public int singleNumber(int[] A) {
        if (null == A || 1 != A.length % 3) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < 32; i++) {
            int bitCount = 0;
            for (int j = 0; j < A.length; j++) {
                if (((A[j] >> i) & 0x01) == 1) {
                    bitCount++;
                }
            }
            result |= (bitCount % 3) << i;
        }

        return result;
    }
}