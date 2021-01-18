package com.codurance.dynamicProgramming;

public class Fibonacci {
  public static int recursiveFib(int n){
    if (n == 0) return 0;
    if (n == 1) return 1;
    return recursiveFib(n - 1) + recursiveFib(n - 2);
  }
}
