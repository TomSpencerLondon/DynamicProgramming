package com.codurance.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static com.codurance.dynamicProgramming.Fibonacci.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
  // 5s 321ms
  @Test
  void return_fib_n_from_nth_number() {
    int result = recursiveFib(45);
    assertEquals(1134903170, result);
  }

  // 16 ms
  @Test
  void topDownCache_returns_fib_n_from_nth_number() {
    int result = topDownCache(45);
    assertEquals(1134903170, result);
  }

  // 14 ms
  @Test
  void bottomUpCache_returns_fib_n_from_nth_number() {
    int result = bottomUpCache(45);
    assertEquals(1134903170, result);
  }
}
