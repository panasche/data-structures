package dp;

import java.util.Arrays;
public class coins_bottom_up {
    public static int minCoinChange(int[] coins, int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int[] denominations = {1, 5, 10, 25};
        int value = 36;
        int minCoins = minCoinChange(denominations, value);
        System.out.println("The minimum number of coins needed to make " + value + " is: " + minCoins);
    }
}
