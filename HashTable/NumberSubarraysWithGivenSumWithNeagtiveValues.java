package HashTable;
import java.util.*;
public class NumberSubarraysWithGivenSumWithNeagtiveValues {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();
        int sum = sc.nextInt();
        subArraySum( arr,  n,  sum);
    }
    public static int subArraySum(int[] arr, int n, int k)
    {   int sum[] = new int[n+1];
        for(int i=1;i<=n;i++)
            sum[i] = sum[i-1]+arr[i-1];
        HashMap <Integer,Integer> h = new HashMap<>(); 
        int total = 0;
        for(int i =0;i<=n;i++)
            {   
                total = total + h.getOrDefault(sum[i]-k,0);
                h.put(sum[i],h.getOrDefault(sum[i],0)+1);
            }
        
        
        return total;
    }
}
