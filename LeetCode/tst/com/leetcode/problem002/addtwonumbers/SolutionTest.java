package com.leetcode.problem002.addtwonumbers;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.ListNode;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * 
 * @Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) 
 * @Output: 7 -> 0 -> 8
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
        ListNode l1 = new ListNode(2);
        ListNode temp1 = l1;
        temp1.next = new ListNode(4);
        temp1 = temp1.next;
        temp1.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        ListNode temp2 = l2;
        temp2.next = new ListNode(6);
        temp2 = temp2.next;
        temp2.next = new ListNode(4);

        ListNode result = solution.addTwoNumbers(l1, l2);
        while (null != result) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
