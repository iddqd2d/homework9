package com.collections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class MyStackTest {
    MyStack myStack;

    @Before
    public void setUp() throws Exception {
        myStack = new MyStack();
    }

    @Test
    public void push() {
        String expectedValue = "test";
        MyStack expectedStack = new MyStack();
        expectedStack.push(expectedValue);
        myStack.push(expectedValue);
        assertNotEquals(expectedStack, myStack);
        assertEquals(expectedValue, myStack.peek());
    }

    @Test
    public void peek() {
        push();
        String expectedValue = "test2";
        myStack.push(expectedValue);
        assertEquals(expectedValue, myStack.peek());
    }

    @Test
    public void pop() {
        peek();
        int expectedSize = myStack.getSize();
        myStack.pop();
        assertNotEquals(expectedSize, myStack.getSize());
    }
}
