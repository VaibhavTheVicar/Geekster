package DynamicProgramming;
import java.util.*;
public class knapsackBasedProblems {
    public static void main(String[] args) {
        // int j = new Scanner(System.in).nextInt();
        // System.out.println(j);
		minimumDifferenceBetweenSubsetSum(new int[]{ 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82, 28, 62, 92, 96, 43, 28, 37, 92, 5, 3, 54, 93, 83, 22, 17, 19, 96, 48, 27, 72, 39, 70, 13, 68, 100, 36, 95, 4, 12, 23, 34, 74, 65, 42, 12, 54, 69, 48, 45});
	}

    static void minimumDifferenceBetweenSubsetSum(int[] num){
        int n = num.length;
        int sum = 0;
        for(int i:num)sum+=i;
        boolean[][] dp = getSubsetSumMatrix(num,sum);
        int mn = sum;
        for(int i = 0;i<=sum/2+sum%2;i++)
            if(dp[n][i])
                mn = Math.min(Math.abs(sum-2*i),mn);
        System.out.println(mn);
    }


    static boolean[][] getSubsetSumMatrix(int[] nums,int ts){
        int n = nums.length;

        boolean t[][] = new boolean[n+1][ts+1];
        for(int i = 0;i<n+1;i++){
            for(int j=0;j<ts+1;j++){
                
				if(i==0||j==0)
                {if(j==0)
                    t[i][j] = true;
                }
                else{
                    if(nums[i-1]<=j)
                         t[i][j] = t[i-1][j-nums[i-1]] || t[i-1][j];
                    else
                        t[i][j] = t[i-1][j];
                }
            }
        }
        return t;
    }


	public static boolean subsetSum(int ts,int[] nums){
        int n = nums.length;
        boolean t[][] = new boolean[n+1][ts+1];
        for(int i = 0;i<n+1;i++){
            for(int j=0;j<ts+1;j++){
                
				if(j==0)
                        t[i][j] = true;
                
                else if(i==0) continue;
                else{
                    if(nums[i-1]<=j)
                         t[i][j] = t[i-1][j-nums[i-1]] || t[i-1][j];
                    else
                        t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][ts];
    }
		
}
