package com.leetcode.problem056.mergeintervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.leetcode.problem.utils.Interval;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 * 
 * For example, Given [1,3],[2,6],[8,10],[15,18], return [1,6],[8,10],[15,18].
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if (null == intervals || intervals.size() < 2) {
            return intervals;
        }

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start != o2.start) {
                    return o1.start - o2.start;
                }
                return o1.end - o2.end;
            }
        });

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (int i = 1; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.start <= end) {
                end = Math.max(end, interval.end);
            } else {
                Interval newInterval = new Interval(start, end);
                result.add(newInterval);
                start = interval.start;
                end = interval.end;
            }
        }

        Interval newInterval = new Interval(start, end);
        result.add(newInterval);

        return result;
    }
}