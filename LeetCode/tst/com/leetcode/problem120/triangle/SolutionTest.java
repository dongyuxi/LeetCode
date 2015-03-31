package com.leetcode.problem120.triangle;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    public Solution solution = null;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test() {
        List<Integer> line1 = new ArrayList<Integer>();
        line1.add(2);

        List<Integer> line2 = new ArrayList<Integer>();
        line2.add(3);
        line2.add(4);

        List<Integer> line3 = new ArrayList<Integer>();
        line3.add(6);
        line3.add(5);
        line3.add(7);

        List<Integer> line4 = new ArrayList<Integer>();
        line4.add(4);
        line4.add(1);
        line4.add(8);
        line4.add(3);

        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        triangle.add(line1);
        triangle.add(line2);
        triangle.add(line3);
        triangle.add(line4);

        assertEquals(11, solution.minimumTotal(triangle));
    }
}