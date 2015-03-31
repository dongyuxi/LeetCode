package com.leetcode.problem056.mergeintervals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.Interval;
import com.leetcode.problem.utils.Utils;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 * 
 * For example, Given [1,3],[2,6],[8,10],[15,18], return [1,6],[8,10],[15,18].
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
        List<Interval> intervals = new ArrayList<Interval>();
        Interval interval1 = new Interval(1, 3);
        Interval interval2 = new Interval(2, 6);
        Interval interval3 = new Interval(8, 10);
        Interval interval4 = new Interval(15, 18);
        intervals.add(interval1);
        intervals.add(interval2);
        intervals.add(interval3);
        intervals.add(interval4);
        Utils.showList(solution.merge(intervals));
    }
}