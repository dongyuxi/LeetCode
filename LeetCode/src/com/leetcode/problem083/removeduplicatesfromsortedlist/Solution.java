package com.leetcode.problem083.removeduplicatesfromsortedlist;

import com.leetcode.problem.utils.ListNode;

/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * 
 * For example, Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (null == head) {
            return null;
        }

        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = null;
        ListNode prevHead = fakeHead;
        ListNode indexHead = head;
        ListNode nextHead = indexHead.next;
        int val = indexHead.val;
        boolean dup = false;
        while (null != indexHead) {
            if (null != nextHead) {
                if (val == nextHead.val) {
                    dup = true;
                    while (null != nextHead && nextHead.val == val) {
                        nextHead = nextHead.next;
                    }
                }
            }

            if (!dup) {
                prevHead.next = indexHead;
                prevHead = indexHead;
                prevHead.next = null;
            }
            indexHead = nextHead;
            if (null != nextHead) {
                val = nextHead.val;
                dup = false;
                nextHead = nextHead.next;
            }
        }

        return fakeHead.next;
    }
}