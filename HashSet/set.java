package HashSet;
import java.util.*;
public class set {
    public static void main(String[] args) {
        for(int i:new set().twoSum(new int[]{1,2,3,4},5))
            System.out.println(i);
        // int dct[] = new int[256];
        // Arrays.fill(dct,-1);
        // System.out.println( Arrays.toString(dct));
        // List<Integer> l =Arrays.asList(1,2,3,4,5,6);
        // int l2[][] = {{2,3,4,5},{0,1,2,3}};  
        // Arrays.sort(l2,(p,q)->q[0]-p[0]);
        // l.forEach(n->System.out.println(n));

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> s = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
            {int k = s.getOrDefault(target - nums[i],-10);
            if(k==-10) s.put(nums[i],i);   
            else return new int[]{i,s.get(target - nums[i])};
                }
        return new int[]{-1};
}
}
