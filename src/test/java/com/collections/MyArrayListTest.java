package com.collections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class MyArrayListTest  {
    private MyArrayList myArrayList;

    @Before
    public void setUp() throws Exception {
        myArrayList = new MyArrayList<>();
    }

    @Test
    public void getSize() {
        myArrayList.add("One").add("Two").add("Three");
        int expectedSize = 3;
        assertEquals(expectedSize, myArrayList.getSize());
    }

    @Test
    public void add() {
        String value = "test";
        MyArrayList expectedList = new MyArrayList();
        expectedList.add(value);
        myArrayList.add(value);
        assertNotEquals(expectedList, myArrayList);
        assertEquals(myArrayList.add(value), myArrayList);
    }

    @Test
    public void remove() {
        int expectedSize = myArrayList.getSize();
        myArrayList.add("One");
        assertNotEquals(expectedSize, myArrayList.getSize());
    }

    @Test
    public void clear() {
        myArrayList.add(1).add(2).add(3);
        int expectedSize = myArrayList.getSize();
        myArrayList.clear();
        assertNotEquals(expectedSize, myArrayList.getSize());
        assertTrue(myArrayList.isEmpty());
    }
}
