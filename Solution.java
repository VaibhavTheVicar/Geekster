import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        long n=Long.valueOf(a);
        long res=0;
      for(int i = 2; i*i< n; i++) {
         while(n%i == 0) {
            res=res^i;
            n = n/i;
         }
          if(n==0) break;
      }
      if(n >2) {
         res=res^n;
      }
   System.out.println(res);
    }
}