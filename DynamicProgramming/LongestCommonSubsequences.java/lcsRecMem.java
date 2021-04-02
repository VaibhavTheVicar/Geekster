package DynamicProgramming.LongestCommonSubsequences.java;
import java.util.*;
public class lcsRecMem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X =sc.next(),Y=sc.next();
        int[][] dp = new int[X.length()+1][Y.length()+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(lcsMemo(X,Y,X.length(),Y.length(),dp));
    }
    public static int lcsMemo(String X,String Y,int m,int n,int[][] dp){
        if(m==0||n==0)
            return 0;
        if(dp[m][n] != -1)
            return dp[m][n];
        

        if(X.charAt(m-1)==Y.charAt(n-1))
            {dp[m][n] = 1 + lcsMemo(X,Y,m-1,n-1,dp);return dp[m][n];}
        else{
            dp[m][n] = Math.max(lcsMemo(X,Y,m-1,n,dp),lcsMemo(X,Y,m,n-1,dp));
            return dp[m][n];
        }
        }
}
