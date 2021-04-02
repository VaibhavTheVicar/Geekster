package DynamicProgramming;
import java.util.*;
public class Kanpsack {
    public static void main(String args0[]){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int n = sc.nextInt();
        int val[]= new int[n];
        int wt[] = new int[n];

        for (int i = 0; i < n; i++)
            val[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            wt[i] = sc.nextInt();
        
        System.out.println(solve(W,n,wt,val));
    }

    public static HashMap<List<Integer>,Integer> h = new HashMap<>();
    public static int solve(int W,int n,int[]wt,int[]val){
        int ans = h.getOrDefault(List.of(n,W),-1);
        if(ans!=-1)
            return ans;
        if(n==0)
            return 0;
        if (W==0)
            return 0;

        if(wt[n-1]>W)
            {int a = solve(W,n-1,wt,val);
            
            h.put(List.of(n,W),a);
            return a;}

        else
            {
                int a = solve(W,n-1,wt,val);
                int b = val[n-1] + solve(W-wt[n-1],n-1,wt,val);
                if(b>a){a = b;}
            h.put(List.of(n,W),a);
            return a;}
    }


}
