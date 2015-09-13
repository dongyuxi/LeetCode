package com.leetcode.problem225.implementstackusingqueues;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Implement the following operations of a stack using queues.
 * 
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * empty() -- Return whether the stack is empty.
 * 
 * @author dongyuxi
 *
 */
public class SolutionTest {
    public MyStack stack = null;

    @Before
    public void setup() {
        stack = new MyStack();
    }

    @Test
    public void test() {
        assertEquals(true, stack.empty());
        stack.push(0);
        assertEquals(0, stack.top());
        stack.push(1);
        assertEquals(1, stack.top());
        stack.pop();
        assertEquals(0, stack.top());
        stack.pop();
        assertEquals(true, stack.empty());
    }
}
