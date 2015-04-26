package com.leetcode.problem081.searchinrotatedsortedarrayii;

/**
 * Follow up for "Search in Rotated Sorted Array":
 * What if duplicates are allowed?
 * 
 * Would this affect the run-time complexity? How and why?
 * 
 * Write a function to determine if a given target is in the array.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public boolean search(int[] A, int target) {
        if (null == A || 0 == A.length) {
            return false;
        }

        return rotatedBinSearch(A, 0, A.length - 1, target);
    }

    private boolean rotatedBinSearch(int[] A, int start, int end, int target) {
        if (start > end) {
            return false;
        }

        int mid = (start + end) / 2;
        if (target == A[mid]) {
            return true;
        }

        if (A[start] < A[mid]) {
            if (A[start] <= target && target < A[mid]) {
                return binSearch(A, start, mid - 1, target);
            } else {
                return rotatedBinSearch(A, mid + 1, end, target);
            }
        } else if (A[mid] < A[end]) {
            if (A[mid] < target && target <= A[end]) {
                return binSearch(A, mid + 1, end, target);
            } else {
                return rotatedBinSearch(A, start, mid - 1, target);
            }
        } else {
            return lineSearch(A, start, mid - 1, target) || lineSearch(A, mid + 1, end, target);
        }
    }

    private boolean lineSearch(int[] A, int start, int end, int target) {
        for (int i = start; i <= end; i++) {
            if (target == A[i]) {
                return true;
            }
        }
        return false;
    }

    private boolean binSearch(int[] A, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == A[mid]) {
                return true;
            }
            if (target < A[mid]) {
                end = mid - 1;
                continue;
            }
            start = mid + 1;
        }
        return false;
    }
}