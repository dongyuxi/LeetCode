package com.leetcode.problem142.linkedlistcycleii;

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
    public ListNode detectCycle(ListNode head) {
        if (null == head || null == head.next) {
            return null;
        }

        ListNode stepOneHead = head.next;
        ListNode stepTwoHead = head.next.next;
        while (null != stepOneHead && null != stepTwoHead) {
            if (stepOneHead == stepTwoHead) {
                break;
            }
            stepOneHead = stepOneHead.next;
            if (null == stepTwoHead.next) {
                return null;
            }
            stepTwoHead = stepTwoHead.next.next;
        }

        if (null == stepTwoHead || null == stepTwoHead.next) {
            return null;
        }

        stepTwoHead = head;
        while (stepOneHead != stepTwoHead) {
            stepOneHead = stepOneHead.next;
            stepTwoHead = stepTwoHead.next;
        }

        return stepOneHead;
    }
}