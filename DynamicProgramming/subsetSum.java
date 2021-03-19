package DynamicProgramming;
import java.util.*;
public class subsetSum {
    static boolean equalPartition(int N, int arr[]){
        int s=0;
        for(int i:arr)
            s+=i;
        if(s%2!=0) 
            return false;
        return solve(N,s,arr);}
    static boolean solve(int n,int w,int wt[]){
        if(w==0) return true;
        if(n==0) return false;

        if(wt[n-1]<=w)
            return solve(n-1,w-wt[n-1],wt)||solve(n-1,w,wt);
        return solve(n-1,w,wt);
    }
    public static void main(String[] args) {
        System.out.println(equalPartition(4,new int[]{1,5,5,11}));
    }
}
