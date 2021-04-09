class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum[] = nums;
        for(int i=1;i<n;i++)
            sum[i] = sum[i-1]+ sum[i];
        int u = 0;int l = -1;
        int res = Integer.MAX_VALUE;
        while(u>=l)
        {   int at_u = sum[u];
         
            int at_l = 0;
            if(l!=-1)
                at_l = sum[l];
            if(at_u-at_l>=target)
            {res=Math.min(res,u-l);l++;}
            else u++;
            if(u==n) break;
            
        }
        if (res == Integer.MAX_VALUE) return 0;
        return res;
    }   
}