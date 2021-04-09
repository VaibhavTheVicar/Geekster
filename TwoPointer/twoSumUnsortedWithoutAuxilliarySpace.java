package TwoPointer;
import java.util.*;
public class twoSumUnsortedWithoutAuxilliarySpace {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            
            
            int n =nums.length;
            int dct[][] = new int[n][2];
            for(int i=0;i<n;i++)
            {dct[i][0]=nums[i];dct[i][1] = i;}
            Arrays.sort(dct,(x,y)->x[0]-y[0]);
            int u = n-1;
            int l = 0;
            for(int i=0;i<n;i++) System.out.println(dct[i][0]+" "+dct[i][1]);
            while(u>l)
            {
                if(dct[u][0]+dct[l][0]==target) return new int[]{dct[u][1],dct[l][1]};
                
                if(dct[u][0]+dct[l][0]<target) l++;
                
                else u--;
            }
            return new int[]{-1,-1};
        }
    }
}
