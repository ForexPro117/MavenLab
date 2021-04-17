package ru.calcLogic;

import junit.framework.TestCase;

public class calcActionTest extends TestCase {
    int a = 6;
    int b = 3;

    public void testSum() {
        assertEquals(a + b, 9);
    }

    public void testSub() {
        assertEquals(a - b, 3);
    }

    public void testMul() {
        assertEquals(a * b, 18);
    }

    public void testDiv() {
        assertEquals(a / b, 2);
    }
}