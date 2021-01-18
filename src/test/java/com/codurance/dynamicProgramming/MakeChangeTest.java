package com.codurance.dynamicProgramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codurance.dynamicProgramming.MakeChange.makeChange;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeChangeTest {
  @ParameterizedTest
  @CsvSource(
      {
          "1, 1",
          "6, 2",
          "49, 7"
      }
  )
  void returns_correct_total_coins_for_amount_of_change(int input, int expected) {
    int output = makeChange(input);

    assertEquals(expected, output);
  }
}
