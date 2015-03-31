package com.leetcode.problem155.minstack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * 
 * 
 * @author dongyuxi
 *
 */
public class MinStackTest {
    public MinStack stack = null;

    @Before
    public void setup() {
        stack = new MinStack();
    }

    @Test
    public void testStory() {
        stack.push(1);
        assertEquals(1, stack.top());
        assertEquals(1, stack.getMin());

        stack.push(2);
        assertEquals(2, stack.top());
        assertEquals(1, stack.getMin());

        stack.push(0);
        assertEquals(0, stack.top());
        assertEquals(0, stack.getMin());

        stack.pop();
        assertEquals(2, stack.top());
        assertEquals(1, stack.getMin());
    }
}