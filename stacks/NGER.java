package stacks;
import java.util.*;
public class NGER {
        public static void main(String[] args) {
            long[] ip = new long[]{1,2,0,0,1,3,4};
            int n = ip.length;
            long[] arr = nextLargerElement(ip,n);
            for(long i:arr){
                System.out.print(i+" ");
            }
        }
        public static long[] nextLargerElement(long[] arr, int n) { 

            Stack<Long> st = new Stack<>();
            long[] ans = new long[n];
            for(int i = n-1;i>=0;i--)
            {
                long ele = arr[i];

                if(st.empty()) ans[i] = -1;   
                else if(st.peek()>ele) ans[i] = st.peek();
                while(!st.empty() && st.peek()<=ele) st.pop();
                if(st.empty()) ans[i] = -1;
                else if(st.peek()>ele) ans[i] = st.peek();
                
                st.push(ele);
            }
            return ans;
        } 
    }

