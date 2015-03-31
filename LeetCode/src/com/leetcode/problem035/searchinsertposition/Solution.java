package com.leetcode.problem035.searchinsertposition;

/**
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Here are few examples.
 * [1,3,5,6], 5 ¡ú 2
 * [1,3,5,6], 2 ¡ú 1
 * [1,3,5,6], 7 ¡ú 4
 * [1,3,5,6], 0 ¡ú 0
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public int searchInsert(int[] A, int target) {
        if (null == A || 0 == A.length) {
            return -1;
        }

        return binSearch(A, 0, A.length - 1, target);
    }

    private int binSearch(int[] a, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == target) {
                return mid;
            }
            if (target < a[mid]) {
                end = mid - 1;
            } else if (a[mid] < target) {
                start = mid + 1;
            }
        }
        return start;
    }

}