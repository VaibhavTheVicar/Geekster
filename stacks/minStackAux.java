package stacks;
import java.util.*;
public class minStackAux {

        /** initialize your data structure here. */
        
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ss = new Stack<>();
        
        
        public void push(int val) {
            st.push(val);
            if(ss.empty() || ss.peek()>=val)
                ss.push(val);
        }
        
        public void pop() {
            if(st.empty()) return;
            int x = st.peek();st.pop();
            if(x==ss.peek()) 
                {ss.pop();}
        }
        
        public int top() {
            return st.peek();
        }
        
        public int getMin() {
            if(ss.empty()) return -1;
            return ss.peek();
        }
    }
