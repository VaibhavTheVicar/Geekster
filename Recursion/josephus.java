package Recursion;
    import java.util.*;
    class josephus{
        public static void main(String[] args) {
            int n = 41;
            int k = 2;
            System.out.println(safePos( n,  k));
            
        }
        static int safePos(int n, int k) {
            List<Integer> list = new ArrayList<Integer>();
           for(int i = 0; i < n; i++)list.add(i+1);
          solve(0,list,k);
          return list.get(0);
           
       }
       
      public static void solve(int sword,List<Integer> soldiers,int k){
           if(soldiers.size()==1)
               return;
           int dead = (sword+k-1)%(soldiers.size());
           soldiers.remove(dead);
           solve(dead,soldiers,k);
          }
    } 

