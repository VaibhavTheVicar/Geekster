package HashTable;
import java.util.*;
public class set {
    public static void main(String[] args) {
        System.out.println(new set().twoSum(new int[]{1,2,3,4},5));

    }
    public int[] twoSum(int[] nums, int target) {
        HashSet <Integer> s = new HashSet<>();
        
        for(int i:nums)
        {if(s.contains(target - i))
            return new int[]{i,target-i};
        s.add(i);
        
    }
}
