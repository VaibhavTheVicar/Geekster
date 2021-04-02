package BinarySearch;
import java.util.*;
public class BsNumberOfOccurrence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        int ele = sc.nextInt();
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int start =0,end =n-1,res = -1,mid = 0;
        while (start<=end) {

            mid = start+ (end-start)/2;

            if(arr[mid] == ele)
                {res = mid;
                end = mid - 1;}

            else if(arr[mid]>ele) end = mid-1;
            
            else start = mid + 1;
            
        }
        int fo = res;
        start =res;end =n-1;res = -1;mid = 0;
        while (start<=end) {

            mid = start+ (end-start)/2;

            if(arr[mid] == ele)
                {res = mid;
                start = mid + 1;}

            else if(arr[mid]>ele) end = mid-1;
            
            else start = mid + 1;
            
        }
        int lo = res;
        System.out.println(lo-fo+1);
    }
}
