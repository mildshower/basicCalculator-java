package com.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
  @Test
  void shouldAddTwoNumbers() {
    double actual = Calculator.add(1, 1);
    assertEquals(2, actual, 0.1);
  }

  @Test
  void shouldSubtractTwoNumbers() {
    double actual = Calculator.sub(1, 1);
    assertEquals(0, actual, 0.1);
  }
}