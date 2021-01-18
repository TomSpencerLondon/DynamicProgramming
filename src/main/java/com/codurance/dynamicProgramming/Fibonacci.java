package com.codurance.dynamicProgramming;

public class Fibonacci {
  public static int recursiveFib(int n){
    if (n == 0) return 0;
    if (n == 1) return 1;
    return recursiveFib(n - 1) + recursiveFib(n - 2);
  }

  public static int topDownCache(int n){
    if (n < 2) return n;
    int[] cache = new int[n+1];
    for (int i = 0; i < cache.length; i++){
      cache[i] = -1;
    }

    cache[0] = 0;
    cache[1] = 1;
    return topDownCache(n, cache);
  }

  public static int topDownCache(int n, int[] cache){
    if (cache[n] >= 0) return cache[n];
    cache[n] = topDownCache(n - 1, cache) + topDownCache(n - 2, cache);
    return cache[n];
  }

  public static int bottomUpCache(int n){
    if (n == 0) return 0;

    int[] cache = new int[n + 1];
    cache[1] = 1;

    for (int i = 2; i <= n; i++){
      cache[i] = cache[i - 1] + cache[i - 2];
    }

    return cache[n];
  }
}
