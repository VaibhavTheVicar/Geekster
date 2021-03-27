package DynamicProgramming;
import java.util.*;
class TargetSum {

    public static void main(String[] args) {
        int ans[] = NextSmallerElement(new int[]{1,3,2,0,0,4},6);
        for(int i: ans) System.out.print(i+" ");
    }

    static int[] NextSmallerElement(int arr[],int n){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        for(int i = 0;i<n;i++){
            int ele= arr[i];
            if(st.empty()) ans[i] = -1;

            else if(st.peek()<ele) ans[i] = st.peek();

            else if(st.peek()>=ele){
                while(!st.empty() && st.peek()>=ele) st.pop();

                if(st.empty()) ans[i] = -1;

                else if(st.peek()<ele) ans[i] = st.peek();
            }

            st.push(ele);
        }
        return ans;
    }

}
    // public int findTargetSumWays(int[] nums, int S) {
    //     if(S>1000) 
    //         return 0;
    //     //to avoid overflow.

    //     int n = nums.length;
    //     int X = 0;
    //     for(int i:nums)X+=i;
        
    //     int sum = (S+X);
    //     if((sum)%2!=0)
    //         return 0;
    //     sum/=2;
    //     System.out.println(sum);
    //     int[] zeroes = new int[n];
    //     int z = 0;
    //     for(int i = 0; i<n; i++)
    //     {
    //         if(nums[i]==0)
    //             z++;
    //         zeroes[i]=z;
    //     }
        
    //     int t[][] = new int[21][1001];
        
    //     for(int i =0;i<=n;i++)
    //     {
    //         for(int j =0;j<=sum;j++)
    //         {
    //             if(i==0||j==0)
    //             {
    //             if(j==0 && i!=0) 
    //                 t[i][j] = (int)Math.pow(2,zeroes[i-1]);
    //             if(j==0&&i==0)
    //                 t[i][j] = 1;
    //                 // if(j==0)
    //                 //     t[i][j] = 1;
    //             }
    //             else
    //             {if(j>=nums[i-1])
    //              t[i][j] = t[i-1][j]+t[i-1][j-nums[i-1]];
    //              else
    //             t[i][j] = t[i-1][j];}
    //         }
    //     }
    //  return t[n][sum];   
    // }

