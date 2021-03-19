package Recursion;
import java.util.*; 
class balancedParanthesis {
    public static void main(String[] args) {
        generateParenthesis(3);  
    }

    public static List<String> generateParenthesis(int n) {
        List<String> x = new ArrayList<>();
        solve("",n,n,x);
        System.out.println(x);
        return x;
    }
    
    static void solve(String op,int o,int c,List<String> ans){
        if(o==0)
        {op = op + ")".repeat(c);
        ans.add(op);
        System.out.println(op);
        return;}
        if(o==c)
        {String op1 = op + "(";
        solve(op1,o-1,c,ans);
        return;}
        if(o>c) return;
        String op1 = op+"(";
        String op2 = op+")";

        solve(op1,o-1,c,ans);
        solve(op2,o,c-1,ans);
    }
}