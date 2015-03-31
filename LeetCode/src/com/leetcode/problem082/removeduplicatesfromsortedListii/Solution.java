package com.leetcode.problem082.removeduplicatesfromsortedListii;

import com.leetcode.problem.utils.ListNode;

/**
 * Given a linked list, determine if it has a cycle in it.
 * 
 * Follow up: Can you solve it without using extra space?
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (null == head || null == head.next) {
            return false;
        }

        ListNode stepOneHead = head.next;
        ListNode stepTwoHead = head.next.next;
        while (null != stepOneHead && null != stepTwoHead) {
            if (stepOneHead == stepTwoHead) {
                return true;
            }
            stepOneHead = stepOneHead.next;
            if (null == stepTwoHead.next) {
                return false;
            }
            stepTwoHead = stepTwoHead.next.next;
        }

        return false;
    }
}