package HashTable;
import java.util.*;
public class LonegstSubarrayWithSumKHandlingNegatives {
    public static int lenOfLongSubarr (int arr[], int n, int k) {
        int sum[] = new int[n+1];
        for(int i=1;i<=n;i++)
            sum[i] = sum[i-1]+arr[i-1];
        HashMap <Integer,Integer> fo = new HashMap<>(); 
        int l =0;
        for(int i=0;i<=n;i++){
            if(!fo.containsKey(sum[i]))
                fo.put(sum[i],i);
            if(fo.containsKey(sum[i]-k))
                l = Math.max(l,i - fo.get(sum[i]-k));
        }
        return l;
    }
}
