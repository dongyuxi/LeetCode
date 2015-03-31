package com.leetcode.problem118.pascalstriangle;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 * For example, given numRows = 5,
 * Return
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
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
    public void test() {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> line1 = new ArrayList<Integer>();
        line1.add(1);

        List<Integer> line2 = new ArrayList<Integer>();
        line2.add(1);
        line2.add(1);

        List<Integer> line3 = new ArrayList<Integer>();
        line3.add(1);
        line3.add(2);
        line3.add(1);

        List<Integer> line4 = new ArrayList<Integer>();
        line4.add(1);
        line4.add(3);
        line4.add(3);
        line4.add(1);

        List<Integer> line5 = new ArrayList<Integer>();
        line5.add(1);
        line5.add(4);
        line5.add(6);
        line5.add(4);
        line5.add(1);

        list.add(line1);
        list.add(line2);
        list.add(line3);
        list.add(line4);
        list.add(line5);

        assertEquals(list, solution.generate(5));
    }
}