package DynamicProgramming;

import java.util.*;
public class subsetsWithGivenSum {
    static int equalPartition(int N, int arr[])
    {int s=0;for(int i:arr)s+=i;
    if(s%2!=0) return 0;
    return solve(N,s,arr);
    }
    static int solve(int n,int w,int wt[]){
        if(w==0) return 1;
        if(n==0) return 0;

        if(wt[n-1]<=w)
            return solve(n-1,w-wt[n-1],wt)+solve(n-1,w,wt);
        return solve(n-1,w,wt);
    }
    public static void main(String[] args) {
        System.out.println(solve(4,1,new int[]{1,1,1,1}));
    }
}
