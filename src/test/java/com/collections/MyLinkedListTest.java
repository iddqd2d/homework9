package com.collections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MyLinkedListTest {
    MyLinkedList myLinkedList;

    @Before
    public void setUp() throws Exception {
        myLinkedList = new MyLinkedList();
    }

    @Test
    public void get() {
        add();
    }

    @Test
    public void add() {
        String val = "test";
        myLinkedList.add(val);
        assertEquals(val, myLinkedList.get(0));
    }

    @Test
    public void remove() {
        for (int i = 1; i <= Integer.BYTES; i++) {
            myLinkedList.add(i);
        }
        assertEquals(Integer.BYTES, myLinkedList.remove(Integer.BYTES));
    }

    @Test
    public void clear() {
        remove();
        int expectedSize = myLinkedList.getSize();
        myLinkedList.clear();
        assertFalse(expectedSize == myLinkedList.getSize());
    }
}
