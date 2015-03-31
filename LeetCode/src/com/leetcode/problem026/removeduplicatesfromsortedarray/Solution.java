package com.leetcode.problem026.removeduplicatesfromsortedarray;

/**
 * Given a sorted array, remove the duplicates in place such that each element
 * appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * For example, Given input array A = [1,1,2],
 * 
 * Your function should return length = 2, and A is now [1,2].
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public int removeDuplicates(int[] A) {
        if (null == A || 0 == A.length) {
            return 0;
        }

        int scanIndex = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == A[scanIndex]) {
                continue;
            }
            A[++scanIndex] = A[i];
        }

        return scanIndex + 1;
    }
}