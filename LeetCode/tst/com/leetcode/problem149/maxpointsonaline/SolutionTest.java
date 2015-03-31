package com.leetcode.problem149.maxpointsonaline;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.Point;

/**
 * Given n points on a 2D plane, find the maximum number of points that lie on
 * the same straight line.
 * 
 * @author dongyuxi
 *
 */
public class SolutionTest {
    public Solution solution = null;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void testValidInput() {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(3, 3);
        Point point3 = new Point(-5, 3);
        Point[] points = new Point[]{point1, point2, point3};
        assertEquals(3, solution.maxPoints(points));
    }
}