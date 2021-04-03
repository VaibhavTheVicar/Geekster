package BinarySearch;
import java.util.*;
public class BsMinRotatedArray{

	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) arr[i] = sc.nextInt();
		System.out.println(findMin(arr));
		
	}
	public int findMin(int[] arr) {
		
		int n = arr.length;
        if(n==1) return arr[0];
		int start = 0,end = n-1;

        while(start<=end) {
			int mid =(end+start)/2;
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;
			if(arr[mid]<=arr[next] && arr[mid]<=arr[prev])
				return arr[mid];
			else if(arr[mid]<=arr[end])
                end = mid-1;
            else if(arr[mid]>=arr[start])
                start = mid+1;

		}
		return -1;
    }

	static findMin_intuitive(int[] arr) {
		
		int n = arr.length;
        if(n==1) return arr[0];
		if(arr[0]<=arr[n-1]) return arr[0];
		if(arr[0]<arr[n-2]) return arr[n-1];
        if (n==2) return arr[0]<=arr[1]?arr[0]:arr[1];
		int start = 0,end = n-1;

        while(start<=end) {
			int mid =(end+start)/2;
			if(mid!=0 && mid!=n-1 && arr[mid]<arr[mid+1] && arr[mid]<arr[mid-1])
				return arr[mid];
			if(arr[mid]>=arr[start] && arr[mid]<=arr[end])
                end = mid-1;
            else if(arr[mid]>=arr[start])
                start =mid+1;
            else end = mid-1;
		}
		return -1;
    }

}