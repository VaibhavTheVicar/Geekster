import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int wt[] = new int[]{1,2,2,5};
        int val[] = new int[]{7,5,2,1};
        int W =7;
        int n = wt.length;
        System.out.println(ks(wt, val, W, n)); 
    }

    static int ks(int wt[], int[] val, int W, int n){
        //Base condition
        if(n==0||W==0)
            return 0;


        //CHoice Diagram
        if(wt[n-1]<=W)
         return Math.max(val[n-1]+ks(wt,val,W-wt[n-1],n-1),ks(wt,val,W,n-1));

        else if(wt[n-1]>W)
         return ks(wt,val,W,n-1);




    }
}
