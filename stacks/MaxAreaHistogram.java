package stacks;
import java.util.*;
public class MaxAreaHistogram {
    public static void main(String[] args) {
        int ip[] =new int[]{6,2,5,4,5,1,6};
        System.out.println(util(ip,ip.length));
    }
    static int util(int[] ip,int n){
        int[] nse = nse(ip,n);
        int[] pse = pse(ip,n);
        int mx = 0;
        for (int i = 0; i < n; i++) {
            mx =Math.max(ip[i]*(nse[i]-pse[i]-1),mx);
        }
        return mx;
    }
    static int[] nse(int[] arr,int n){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for(int i = n-1;i>=0;i--){
            if(st.empty()) ans[i] = n;
            else if(arr[st.peek()]<arr[i]) ans[i] = st.peek();
            else if(arr[st.peek()]>=arr[i]){
            while(!st.empty() && arr[st.peek()]>=arr[i]) st.pop();
            if(st.empty()) ans[i] = n;
            else if(arr[st.peek()]<arr[i]) ans[i] = st.peek();
            }
           st.push(i); 
        }
        return ans;
    }

    static int[] pse(int[] arr,int n){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for(int i = 0;i<n;i++){
            if(st.empty()) ans[i] = -1;
            else if(!st.empty() && arr[st.peek()]<arr[i]) 
                ans[i] = st.peek();
            else if(!st.empty() && arr[st.peek()]>=arr[i])
            {
                while(!st.empty() && arr[st.peek()]>=arr[i]) st.pop();
                if(st.empty()) ans[i] = -1;
                else if(!st.empty() && arr[st.peek()]<arr[i])  ans[i] = st.peek();

            }

            st.push(i);
        }
        return ans;
    }

}
