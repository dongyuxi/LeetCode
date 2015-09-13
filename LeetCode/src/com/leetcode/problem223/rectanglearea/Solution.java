package com.leetcode.problem223.rectanglearea;

/**
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * 
 * Each rectangle is defined by its bottom left corner and top right corner as
 * shown in the figure.
 * 
 * Assume that the total area is never beyond the maximum possible value of int.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left = Math.max(A, E);
        int right = Math.min(C, G);
        int top = Math.min(D, H);
        int bottom = Math.max(B, F);
        int both = 0;
        if (left >=right || top <= bottom) {
            both = 0;
        } else {
            both = (right - left) * (top - bottom);
        }
        int first = (C - A) * (D - B);
        int second = (G - E) * (H - F);
        return first + second - both;
    }
}
