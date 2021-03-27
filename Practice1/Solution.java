package Practice1;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int arr[] = {1,3,2,0,0,4};
        int n = arr.length;
        int [] ans= NextGreaterElement(arr,n);
    }

    static int[] NextGreaterElement(int arr[], int n){

        Stack<Integer> st = new Stack<>(); 
        //List<Integer> l = new ArrayList<>();
        int ans[] = new int[n];
        for(int i = n-1;i>=0;i--){
            int ele= arr[i];
            if(st.empty())
                ans[i] = -1;
            else if(!st.empty() && st.peek()>ele)
                ans[i] = st.peek();

            else if(!st.empty() && st.peek()<=arr[i])
                {
                    while(!st.empty() && st.peek()<=arr[i])
                        st.pop();
                    if(st.empty())
                        ans[i] = -1;
                    else if(!st.empty() && st.peek()>ele)
                        ans[i] = st.peek();
                }

            //l.add(-1);//for n-1 

        }
        return ans;
    }
}
