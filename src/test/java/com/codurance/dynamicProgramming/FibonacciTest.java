package com.codurance.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static com.codurance.dynamicProgramming.Fibonacci.recursiveFib;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
  @Test
  void return_fib_n_from_nth_number() {
    int result = recursiveFib(11);
    assertEquals(89, result);
  }
}
