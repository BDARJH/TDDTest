package test.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testTest {
    test testArithmetic = new test();

    @Test
    void testMultiply() {
        assertEquals(testArithmetic.multiply(2, 3, 4), 24);
    }

    @Test
    void testAdd(){
        assertEquals(testArithmetic.add(2,5), 7);
    }

    @Test
    void testDivide(){
        assertEquals(testArithmetic.divide(10,2), 5);
    }

    @Test
    void testSubtract(){
        assertEquals(testArithmetic.subtract(10,3), 7);
    }
}