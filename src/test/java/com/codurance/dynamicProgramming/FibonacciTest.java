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

  // 13 ms
  // int limit is 2,147,483,647 (2^31)
  // 32 bit signed binary integer maximum
  @Test
  void optimizedBottomup_returns_fib_n_from_nth_number() {
    long result = optimizedBottomUp(50);
    assertEquals(12586269025L, result);
  }
}

// |8192|4096|2048|1024|512|256|128|64|32|16|8|4|2|1|0
//
//1, 0
//1
//1
//1
//
//1, 1
//2
//1
//2
//
//2, 1
//3
//2
//3
//
//3, 2
//5
//3
//5
//
//5, 3
//8
//5
//8
//
//8, 5
//13
//8
//13
//
//13




