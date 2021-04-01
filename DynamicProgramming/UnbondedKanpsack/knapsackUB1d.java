package DynamicProgramming.UnbondedKanpsack;

public    class Solution{
        static int knapSack(int N, int W, int val[], int wt[])
        {   int[] dp = new int[W+1];
            for(int i = 1;i<=N;i++){
                for(int j = 0;j<=W;j++){
                    if(wt[i-1]<=j)
                        dp[j] = Math.max(dp[j],
                                dp[j-wt[i-1]]+val[i-1]);
                }
            }
            return dp[W];
        }
    }

