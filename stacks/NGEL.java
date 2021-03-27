package stacks;
import java.util.*;
public class NGEL {

    public static void main(String[] args) {
        long[] ip = new long[]{1,2,0,0,1,3,4};
            int n = ip.length;
            long[] arr = nextLargerElementLeft(ip,n);
            for(long i:arr){
                System.out.print(i+" ");
            }
    }
    public static long[] nextLargerElementLeft(long[] arr, int n) { 

        Stack<Long> st = new Stack<>();
        long[] ans = new long[n];
        for(int i =0;i<n;i++){
            long ele = arr[i];
            if(st.empty())
                ans[i] = -1;

            else if(!st.empty() && st.peek()>ele)
                ans[i] = st.peek();

            else if(!st.empty() && st.peek()<=ele)
            {
                while(!st.empty() && st.peek()<=ele) st.pop();

                if(st.empty()) ans[i] = -1;

                else if(st.peek()>ele) ans[i] = st.peek();
            }

            st.push(ele);
        }
        return ans;
        }
    
}
