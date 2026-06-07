import java.util.*;

public class Programme9 {

    public static void main(String[] args) {

        int amount = 6;

        int[] coins = {1,3,4};

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for(int i = 1 ; i <= amount ; i++){

            for(int j = 0 ; j < coins.length ; j++){

                if(i >= coins[j] && dp[i - coins[j]] != Integer.MAX_VALUE){

                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        System.out.println("Minimum Coins = " + dp[amount]);
    }
}