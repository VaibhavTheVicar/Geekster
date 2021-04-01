package DynamicProgramming.UnbondedKanpsack;
import java.util.*;
public class cuttingRibbons {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(maximizeCuts(n,a,b,c));
        
        
    }
    
    public int maximizeCuts(int N, int x, int y, int z)
    {int negInf = Integer.MIN_VALUE;
    int dp[][] = new int[4][N+1];
    int[] len = {x,y,z};
    int[] price = {1,1,1};
       for(int i = 0;i<=3;i++){
           for(int j = 0;j<=N;j++){
             if(i==0||j==0){
                  if(i==0)
                  dp[i][j] = negInf;
                //dp[i][j] = 0;
             }  
             else{
                 if(j>=len[i-1])
                 {
                    dp[i][j] = Math.max(dp[i][j-len[i-1]]+price[i-1],dp[i-1][j]);
                 }
                else
                    dp[i][j]=dp[i-1][j];
             }
           }
       }
       if(dp[3][N]<0)
            return 0;
       return dp[3][N];
    }
}


