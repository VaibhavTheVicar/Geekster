package stacks;
import java.util.*;
public class MaxAreaRectangle {
    public int maximalRectangle(char[][] matrix) {
        int R = matrix.length;
        if(R==0) return 0;
        int C= matrix[0].length;
        int[] vector = new int[C];
        int mx = 0;
        for (int i = 0; i < R; i++)
            {for (int j = 0; j < C; j++)
                {if(matrix[i][j]=='1')
                    vector[j]++;
                else
                    vector[j] = 0;}
            
            mx = Math.max(mx,mah(vector,C));
                }  
        return mx;
    }
    static int[] nse(int[] arr, int n){
                Stack<Integer> st = new Stack<Integer>();
                int ans[] = new int[n];

                for(int i =n-1;i>=0;i--){
                    if(st.empty()) ans[i] = n;
                    else if(arr[st.peek()]<arr[i]) ans[i] = st.peek();
                    else if(arr[st.peek()]>=arr[i])
                    {while(!st.empty() && arr[st.peek()]>=arr[i])st.pop();
                    if(st.empty()) ans[i] = n;
                    else ans[i] = st.peek();
                    }
                st.push(i);  
            }return ans;
        }

        static int[] pse(int[] arr, int n){
            Stack<Integer> st = new Stack<Integer>();
            int ans[] = new int[n];

            for(int i =0;i<n;i++){
                if(st.empty()) ans[i] = -1;
                else if(arr[st.peek()]<arr[i]) ans[i] = st.peek();
                else if(arr[st.peek()]>=arr[i])
                {while(!st.empty() && arr[st.peek()]>=arr[i])st.pop();
                if(st.empty()) ans[i] = -1;
                else ans[i] = st.peek();
                }
            st.push(i);  
        }return ans;
    }

    static int mah(int[] arr,int n){
        int[] nse = nse(arr,n);
        int[] pse = pse(arr,n);
        int ans[] = new int[n];
        int mx  = 0;
        for (int i = 0; i < n; i++) 
            {ans[i] = nse[i] - pse[i] - 1;
            mx = Math.max(ans[i]*arr[i],mx);}
        return mx;
        
    }
}
