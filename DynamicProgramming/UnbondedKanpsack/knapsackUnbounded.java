package DynamicProgramming.UnbondedKanpsack;

public class knapsackUnbounded {
    static int knapSack(int N, int W, int val[], int wt[])
    {
       int[][] t = new int[N+1][W+1];
       for(int i = 0;i<=N;i++)
        for(int j=0;j<=W;j++)
         t[i][j] = -1;
        return ksUtil(N, W, val, wt,t);
    }
    public static int ksUtil(int N, int W, int val[], int wt[],int[][] dp){
        if(N==0 || W==0)
            return 0;
        if(dp[N][W] != -1) return dp[N][W];
        else{
            if(wt[N-1]<=W)
                {dp[N][W] = Math.max(val[N-1] + ksUtil(N,W-wt[N-1],val,wt,dp),ksUtil(N-1,W,val,wt,dp));
                    return dp[N][W];}
            dp[N][W] = ksUtil(N-1,W,val,wt,dp);
            return dp[N][W];
        }
    }
}
