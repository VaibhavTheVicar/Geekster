public class minCoins {
        public int coinChange(int[] coins, int amount) {
            int dp[][]=new int[coins.length+1][amount+1];
            for(int j = 0;j<coins.length+1;j++)for(int i = 0;i<amount+1;i++)dp[j][i] = -1;
            int x =  util(coins,amount,coins.length,dp);
            if(x==Integer.MAX_VALUE || x==Integer.MAX_VALUE-1)
                return -1;
            return x;
        }
        
        static int util(int c[],int W,int n,int[][]dp){
            if(dp[n][W]!=-1)
                return dp[n][W];
            if(n==0)
                return Integer.MAX_VALUE-1;
            if(W==0)
                return 0;
            if(c[n-1]<=W)
            { dp[n][W] = Math.min(util(c,W-c[n-1],n,dp)+1,util(c,W,n-1,dp));return dp[n][W];}
            dp[n][W] = util(c,W,n-1,dp);return dp[n][W];
        }
    }

