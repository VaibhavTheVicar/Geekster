package Practice1;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int arr[] = {1,3,0,0,2,4};
        int n = arr.length;
        int ans[] = new int[n];
        nge(arr,n,ans);
        for(int i: ans)
            System.out.println(i);
        
    }

    static int[] nge(int arr[],int n,int[] ans){
        //For every element in an array
        Stack<Integer> st =new Stack<>();
        for (int i = n-1; i >= 0; i--) {
            //St.empty() -> ans=-1
            if(st.empty()) ans[i] = -1;//#1

            else if(st.peek()>arr[i]) ans[i] = st.peek();//#2

            else if(st.peek()<=arr[i]){
                while(!st.empty() && st.peek()<=arr[i]) st.pop();
                if(st.empty()) ans[i] = -1;//#1

                else if(st.peek()>arr[i]) ans[i] = st.peek();//#2
 
            }
            st.push(arr[i]);
        }
        
        
        return ans;

    }

}
