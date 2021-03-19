package HashTable;package HashTable;
import java.util.*;
public class TanyaAndTheBeauty {
    
    
    
    public static void main(String[] args) {
        int[] journey = get_array(s.nextInt());
        HashMap<Integer,Long> dct = new HashMap<>();

        for (int i = 0; i < journey.length; i++) {
            dct.put(i - journey[i],journey[i] + dct.getOrDefault(i - journey[i],0L));
        }
        long m = Collections.max(dct.values());
        System.out.println(m); 
    }
    
    
    
    
    
    
static Scanner s = new Scanner(System.in);   
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
