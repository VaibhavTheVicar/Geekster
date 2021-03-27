package stacks;
import java.util.*;
public class NextSEL {
    public static void main(String[] args) {
        long[] ip = new long[]{1,2,0,0,1,3,4};
            int n = ip.length;
            long[] arr = NextSEL(ip,n);
            for(long i:arr){
                System.out.print(i+" ");
            }
    }

    public static long[] NextSEL(long[] arr, int n) { 

        Stack<Long> st = new Stack<>();
        long[] ans = new long[n];
        for(int i = n-1;i>=0;i--){
            if(st.empty()) ans[i] = -1;

            else if(!st.empty() && st.peek()<arr[i]) ans[i] = st.peek();

            else if(!st.empty() && st.peek()>=arr[i])
            {
                while(!st.empty() && st.peek()>=arr[i]) st.pop();

                if(st.empty()) ans[i] = -1;

                else if(st.peek()<arr[i]) ans[i] = st.peek();
            }

        st.push(arr[i]);
        }
        return ans;
}
}
