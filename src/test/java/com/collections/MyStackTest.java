package com.collections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class MyStackTest {
    MyStack<String> myStack;

    @Before
    public void setUp() throws Exception {
        myStack = new MyStack<>();
        myStack.push("test");
    }

    @Test
    public void push() {
        String expectedValue = "test1";
        MyStack expectedStack = new MyStack();
        expectedStack.push(expectedValue);
        myStack.push(expectedValue);
        assertEquals(expectedStack, myStack);
        assertEquals(expectedValue, myStack.peek());
    }

    @Test
    public void peek() {
        String expectedValue = "test2";
        myStack.push(expectedValue);
        assertEquals(expectedValue, myStack.peek());
    }

    @Test
    public void pop() {
        int expectedSize = myStack.getSize();
        String expectedElement = myStack.peek();
        assertEquals(expectedElement, myStack.pop());
        assertNotEquals(expectedSize, myStack.getSize());
    }
}
