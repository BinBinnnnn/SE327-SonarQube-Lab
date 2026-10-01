package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

       class CalculatorTest {
 @Test
 void testAdd() {
       Calculator calculator = new Calculator();
       assertEquals(5, calculator.add(2, 3));
       }

       @Test
       void testSubtract() {
       Calculator calculator = new Calculator();
       assertEquals(1, calculator.subtract(5, 4));
       }

       @Test
       void testMultiply() {
       Calculator calculator = new Calculator();
       assertEquals(6, calculator.multiply(2, 3));
       }

       @Test
       void testDivide() {
       Calculator calculator = new Calculator();
       assertEquals(2.0, calculator.divide(4, 2), 0.01);
    }
           @Test
           void testDivideByZero() {
               Calculator calculator = new Calculator();
               assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
           }
}
