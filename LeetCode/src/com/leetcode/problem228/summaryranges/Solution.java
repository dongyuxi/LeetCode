package com.leetcode.problem228.summaryranges;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array without duplicates, return the summary of its
 * ranges.
 * 
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        if (null == nums || 0 == nums.length) {
            return list;
        }

        StringBuilder sb = new StringBuilder().append(nums[0]);
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > prev + 1) {
                if (prev != Integer.parseInt(sb.toString())) {
                    sb.append("->").append(prev);
                }
                    
                    list.add(sb.toString());
                sb = new StringBuilder().append(nums[i]);
            }
            prev = nums[i];
        }
        if (prev != Integer.parseInt(sb.toString())) {
            sb.append("->").append(prev);
        }
        list.add(sb.toString());
        return list;
    }
}
