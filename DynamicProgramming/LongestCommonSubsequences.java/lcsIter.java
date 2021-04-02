public class lcsIter {
    static int lcs(int p, int q, String s1, String s2){
        int[][] dp = new int[p+1][q+1];
        for(int i = 0;i<=p;i++){
            for(int j = 0;j<=q;j++){
                if(i==0||j==0) continue;
                
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[p][q];
    }
}
