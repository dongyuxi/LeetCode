package com.leetcode.problem057.insertinterval;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.Interval;
import com.leetcode.problem.utils.Utils;

/**
 * Given a set of non-overlapping intervals, insert a new interval into the
 * intervals (merge if necessary).
 * 
 * You may assume that the intervals were initially sorted according to their
 * start times.
 * 
 * Example 1: Given intervals [1,3],[6,9], insert and merge [2,5] in as
 * [1,5],[6,9].
 * 
 * Example 2: Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in
 * as [1,2],[3,10],[12,16].
 * 
 * This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
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
        Interval interval1 = new Interval(1, 2);
        Interval interval2 = new Interval(3, 5);
        Interval interval3 = new Interval(6, 7);
        Interval interval4 = new Interval(8, 10);
        Interval interval5 = new Interval(12, 16);
        intervals.add(interval1);
        intervals.add(interval2);
        intervals.add(interval3);
        intervals.add(interval4);
        intervals.add(interval5);
        Interval newInterval = new Interval(4, 9);
        Utils.showList(solution.insert(intervals, newInterval));
    }

    @Test
    public void testWrongAnswer() {
        List<Interval> intervals = new ArrayList<Interval>();
        Interval interval1 = new Interval(1, 5);
        intervals.add(interval1);
        Interval newInterval = new Interval(0, 3);
        Utils.showList(solution.insert(intervals, newInterval));
    }

    @Test
    public void testWrongAnswer2() {
        List<Interval> intervals = new ArrayList<Interval>();
        Interval interval1 = new Interval(1, 5);
        intervals.add(interval1);
        Interval newInterval = new Interval(0, 0);
        Utils.showList(solution.insert(intervals, newInterval));
    }
}