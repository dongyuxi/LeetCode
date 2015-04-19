package com.leetcode.problem019.removenthnodefromendoflist;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.ListNode;
import com.leetcode.problem019.removenthnodefromendoflist.Solution;

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
public class SolutionTest {
    public Solution solution = null;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test() {
        ListNode l = new ListNode(1);
        ListNode temp1 = l;
        temp1.next = new ListNode(2);
        temp1 = temp1.next;
        temp1.next = new ListNode(3);
        temp1 = temp1.next;
        temp1.next = new ListNode(4);
        temp1 = temp1.next;
        temp1.next = new ListNode(5);

        ListNode result = solution.removeNthFromEnd(l, 5);
        while (null != result) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
