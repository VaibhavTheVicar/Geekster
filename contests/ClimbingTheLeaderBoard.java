package contests;
import java.util.*;
public class ClimbingTheLeaderBoard{
final static Scanner s = new Scanner(System.in);

public static void main(String[] args) {
    int[] score = get_array(s.nextInt());
    int[] alice = get_array(s.nextInt());
    int[] rank = new int[score.length];
    rank[0] = 1;
    for(int i = 1;i<score.length;i++)
        {rank[i] = rank[i-1];
        if(score[i-1]!=score[i])
            rank[i]++;}
    // show_array(score);
    // show_array(rank);
    // show_array(alice);
    List<Integer> ans=new ArrayList<Integer>();
    for (int el:alice) {
        if(el>score[0])
            {ans.add(1);continue;}
        if(el<score[score.length-1])
            {ans.add(rank[score.length-1]+1);continue;}
        ans.add(rankOf(el,rank,score));
        
    }
    for(int a:ans)
        System.out.println(a);
    
}

public static int rankOf(int el,int[] rank,int[] score) {

    int  l = 0,h=rank.length-1;

    while(l<=h){
        int mid = (l+h)/2;
        if(score[mid]==el)
            return rank[mid];
        if(score[mid]<=el && score[mid-1]>el)
            return rank[mid];
        
        if(score[mid]>el && score[mid+1]<=el)
            return rank[mid]+1;
        
        if(score[mid]<el)
            h = mid-1;
        if(score[mid]>el)
            l = mid+1;
    }
    return 1000;
    
}






private static void show_array(int[] a){
    for(int i:a)
     System.out.print(i+" ");
    System.out.println();

}    

private static int[] get_array(int n){
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = s.nextInt();
    return a;
}
}