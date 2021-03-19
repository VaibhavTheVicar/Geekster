package Recursion;
import java.util.*;
public class onesGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        new onesGreater().solve(0,0,n,"");
    }
    // def solve(o,z,n,op,ans):
    // if z>o:
    //     return
    
    // if n==0:
    //     ans.append(op)
    //     return
    
    // if o==z:
    //     op1 = op+'1'
    //     solve(o+1,z,n-1,op1,ans)
    // else: 
    //     op1 = op+'1'
    //     op2 = op+'0'
    //     solve(o+1,z,n-1,op1,ans)
    //     solve(o,z+1,n-1,op2,ans)

    public void solve(int o ,int z,int n,String op) {

        if(o<z) return;

        
        if(n==0){System.out.println(op); return;}

        if(o==z)
            {solve(o+1,z,n-1,op+"1");}
            
        else{solve(o+1,z,n-1,op+"1");
        solve(o,z+1,n-1,op+"0");}

        
        
        }
    
}
