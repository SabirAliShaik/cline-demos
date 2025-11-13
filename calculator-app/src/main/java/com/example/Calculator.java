package com.example;

/**
 * Hello world!
 *
 */
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }

    public boolean duplicate_elements(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
        for (int n : nums) {
            if (!seen.add(n)) {
                return true;
            }
        }
        return false;
    }
}
