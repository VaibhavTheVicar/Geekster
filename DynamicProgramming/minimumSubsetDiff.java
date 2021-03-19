package DynamicProgramming;

public class minimumSubsetDiff {
    public static void main(String[] args) {
        
    }

    public int solve(int[] wt, int w, int n) {
        if(w==0) return true;
        if(n==0) return false;

        if(wt[n-1]<=w)
            return Math.min(solve(n-1,w-wt[n-1],wt)||solve(n-1,w,wt);)
        return solve(n-1,w,wt);
    }
    
}
