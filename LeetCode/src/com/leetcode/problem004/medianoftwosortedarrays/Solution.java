package com.leetcode.problem004.medianoftwosortedarrays;

/**
 * There are two sorted arrays A and B of size m and n respectively. Find the
 * median of the two sorted arrays. The overall run time complexity should be
 * O(log (m+n)).
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        int aLen = A.length;
        int bLen = B.length;

        if ((aLen + bLen) % 2 != 0)
            return (double) findKth(A, B, (aLen + bLen) / 2, 0, aLen - 1, 0, bLen - 1);
        else {
            return (findKth(A, B, (aLen + bLen) / 2, 0, aLen - 1, 0, bLen - 1) + findKth(A,
                    B, (aLen + bLen) / 2 - 1, 0, aLen - 1, 0, bLen - 1)) * 0.5;
        }
    }

    public int findKth(int A[], int B[], int k, int aStart, int aEnd,
            int bStart, int bEnd) {
        int aLen = aEnd - aStart + 1;
        int bLen = bEnd - bStart + 1;

        if (aLen == 0)
            return B[bStart + k];
        if (bLen == 0)
            return A[aStart + k];
        if (k == 0)
            return A[aStart] < B[bStart] ? A[aStart] : B[bStart];

        int aMid = aLen * k / (aLen + bLen);
        int bMid = k - aMid - 1;

        aMid = aMid + aStart;
        bMid = bMid + bStart;

        if (A[aMid] > B[bMid]) {
            k = k - (bMid - bStart + 1);
            aEnd = aMid;
            bStart = bMid + 1;
        } else {
            k = k - (aMid - aStart + 1);
            bEnd = bMid;
            aStart = aMid + 1;
        }

        return findKth(A, B, k, aStart, aEnd, bStart, bEnd);
    }
}