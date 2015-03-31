package com.leetcode.problem149.maxpointsonaline;

import java.util.HashMap;
import java.util.Map;

import com.leetcode.problem.utils.Point;

/**
 * Given n points on a 2D plane, find the maximum number of points that lie on
 * the same straight line.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public int maxPoints(Point[] points) {
        if (null == points) {
            return 0;
        }

        int maxNumber = 0;
        for (int i = 0; i < points.length; i++) {
            int sameNumber = 0;
            int xNumber = 0;
            int yNumber = 0;
            Map<Double, Integer> map = new HashMap<Double, Integer>();
            for (int j = i + 1; j < points.length; j++) {
                if (points[j].x == points[i].x && points[j].y == points[i].y) {
                    sameNumber++;
                } else {
                    if (points[j].x == points[i].x) {
                        xNumber++;
                    } else if (points[j].y == points[i].y) {
                        yNumber++;
                    } else {
                        double k = (double)(points[j].y - points[i].y) / (points[j].x - points[i].x);
                        if (!map.containsKey(k)) {
                            map.put(k, 1);
                        } else {
                            map.put(k, map.get(k) + 1);
                        }
                    }
                }
            }
            int curMaxNumber = Math.max(xNumber, yNumber);
            for (Integer number : map.values()) {
                if (number > curMaxNumber) {
                    curMaxNumber = number;
                }
            }
            if (sameNumber + curMaxNumber + 1 > maxNumber) {
                maxNumber = sameNumber + curMaxNumber + 1;
            }
        }

        return maxNumber;
    }
}