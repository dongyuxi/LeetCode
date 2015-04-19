package com.leetcode.problem019.removenthnodefromendoflist;

import com.leetcode.problem.utils.ListNode;

/**
 * Given a linked list, remove the nth node from the end of list and return its
 * head.
 * 
 * For example,
 * 
 * Given linked list: 1->2->3->4->5, and n = 2.
 * 
 * After removing the second node from the end, the linked list becomes
 * 1->2->3->5. Note: Given n will always be valid. Try to do this in one pass.
 * 
 * @author dongyuxi
 *
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (null == head || n < 0) {
            return null;
        }
        if (0 == n) {
            return head;
        }
        ListNode tempHead = head;
        ListNode nBeforeHead = head;
        for (int i = 0; i < n; i++) {
            if (null == nBeforeHead) {
                return null;
            }
            nBeforeHead = nBeforeHead.next;
        }
        // if the head is last nth node, change the head
        if (null == nBeforeHead) {
            return tempHead.next;
        }
        while (null != nBeforeHead.next) {
            tempHead = tempHead.next;
            nBeforeHead = nBeforeHead.next;
        }
        tempHead.next = tempHead.next.next;
        return head;
    }
}
