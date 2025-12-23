package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    void testAdd() {
        Assertions.assertEquals(8, calculator.add(5, 3));
        Assertions.assertEquals(0, calculator.add(-5, 5));
        Assertions.assertEquals(-10, calculator.add(-5, -5));
    }
    
    @Test
    void testSubtract() {
        Assertions.assertEquals(2, calculator.subtract(5, 3));
        Assertions.assertEquals(-8, calculator.subtract(2, 10));
    }
    
    @Test
    void testMultiply() {
        Assertions.assertEquals(15, calculator.multiply(3, 5));
        Assertions.assertEquals(-6, calculator.multiply(3, -2));
    }
    
    @Test
    void testDivide() {
        Assertions.assertEquals(2.5, calculator.divide(5, 2));
        Assertions.assertEquals(-3.0, calculator.divide(9, -3));
    }
    
    @Test
    void testDivideByZero() {
        ArithmeticException exception = Assertions.assertThrows(
            ArithmeticException.class,
            () -> calculator.divide(10, 0)
        );
        Assertions.assertEquals("Division by zero", exception.getMessage());
    }
    
    @Test
    void testIsEven() {
        Assertions.assertTrue(calculator.isEven(4));
        Assertions.assertTrue(calculator.isEven(0));
        Assertions.assertFalse(calculator.isEven(7));
        Assertions.assertFalse(calculator.isEven(-3));
    }
}
