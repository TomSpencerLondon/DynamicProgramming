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
}
