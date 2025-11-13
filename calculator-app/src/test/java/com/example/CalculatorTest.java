package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(5, 0);
        });
        Assertions.assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @Test
    public void testDuplicateelements() {
        Calculator calc = new Calculator();

        // Arrays with duplicates
        Assertions.assertTrue(calc.duplicate_elements(new int[] { 1, 2, 3, 1 }));
        Assertions.assertTrue(calc.duplicate_elements(new int[] { -1, -1 }));

        // Arrays without duplicates
        Assertions.assertFalse(calc.duplicate_elements(new int[] { 1, 2, 3, 4 }));
        Assertions.assertFalse(calc.duplicate_elements(new int[] {}));
        Assertions.assertFalse(calc.duplicate_elements(new int[] { 42 }));

        // Null array should return false (no duplicates)
        Assertions.assertFalse(calc.duplicate_elements(null));
    }
}
