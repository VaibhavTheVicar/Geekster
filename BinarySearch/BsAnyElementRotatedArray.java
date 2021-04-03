package BinarySearch;

public class BsAnyElementRotatedArray {
    public int search(int[] nums, int target) {
        if(nums.length == 1) return nums[0]==target?0:-1;
        if(nums.length == 2) return nums[0]==target?0:(nums[1]==target?1:-1);
        int ct = minIndex(nums);
        int f = binarySearch(nums,0,ct,target);
        if(f!=-1) return f;
        return binarySearch(nums,ct,nums.length-1,target);
    }
    
    static int binarySearch(int[] arr,int start,int end,int target){
        int n =arr.length;
        while(start<=end){
            int mid = (start+end)/2;
            int prev = mid+n-1;
            prev= prev%n;
            int next = mid+1;
            next%=n;
            
            if(arr[mid] == target)
                return mid;
            else if(arr[mid]<target) start = mid+1;
            else end = mid-1;
            
        }
        return -1;
    }
    
    static int minIndex(int[] arr){
        int start =0,n=arr.length,end = n-1,mid=0;
        
        while(start<=end){
            mid = (start+end)/2;
            int prev = mid+n-1;
            prev= prev%n;
            int next = mid+1;
            next%=n;
            
            if(arr[mid]<arr[prev] && arr[mid]<arr[prev])
                return mid;
            else if(arr[mid]>arr[start] && arr[mid]<arr[end]) end = mid-1;
            else if(arr[mid]<arr[start])end = mid-1;
            else   start = mid+1;
        }
        return -1;
    }
}
