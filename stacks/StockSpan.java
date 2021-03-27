package stacks;

public class StockSpan {
    public static int[] calculateSpan(int arr[], int n)
    {
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0;i<n;i++){
            if(st.empty()) ans[i] = -1;
            
            else if(arr[st.peek()]>arr[i]) ans[i] = st.peek();
            
            else if(arr[st.peek()]<=arr[i])
            {
                while(!st.empty() && arr[st.peek()]<=arr[i])
                    st.pop();
                    
                if(st.empty())
                    ans[i] = -1;
                    
                else
                    ans[i] = st.peek();
                    
            }
            st.push(i);
        }
        
        for(int i = 0;i<n;i++)
            ans[i] = i-ans[i];
        
        
        return ans;
    }
}
