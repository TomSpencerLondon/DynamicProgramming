package com.codurance.dynamicProgramming;

public class MakeChange {
  private static int[] coins = new int[]{1, 5, 10, 25};

  public static int makeChange(int c){
    if (c == 0) return 0;
    int minCoins = Integer.MAX_VALUE;

    for(int coin: coins){
      if (c - coin >= 0){
        int currMinCoins = makeChange(c - coin);
        if (currMinCoins < minCoins){
          minCoins = currMinCoins;
        }
      }
    }

    return minCoins + 1;
  }

  public static int makeChangeDynamic(int c){
    int[] cache = new int[c + 1];
    for (int i = 1; i < c + 1; i++){
      cache[i] = -1;
    }
    return makeChangeDynamic(c, cache);
  }

  private static int makeChangeDynamic(int c, int[] cache){
    if (cache[c] >= 0) return cache[c];

    int minCoins = Integer.MAX_VALUE;
    for (int coin: coins) {
      if (c - coin >= 0){
        int currMinCoins = makeChangeDynamic(c - coin, cache);
        if (currMinCoins < minCoins){
          minCoins = currMinCoins;
        }
      }
    }

    cache[c] = minCoins + 1;
    return cache[c];
  }

  public static int makeChangeTopDown(int c) {
    int[] cache = new int[c + 1];
    for (int i  = 1; i <= c; i++){
      int minCoins = Integer.MAX_VALUE;
      for (int coin: coins){
        if (i - coin >= 0){
          int currCoins = cache[i - coin] + 1;
          if (currCoins < minCoins){
            minCoins = currCoins;
          }
        }
      }
      cache[i] = minCoins;
    }
    return cache[c];
  }
}
