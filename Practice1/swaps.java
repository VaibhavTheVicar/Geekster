package Practice1;

public class swaps {
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank", "kanb")); 
    }

    public boolean areAlmostEqual(String s1, String s2) {
       int l1= s1.length();
        int l2= s2.length();
        if(l1!=l2)
            return false;
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        int swaps = 0;
        for(int i =0;i<l1;i++){
            
            if(a[i]!=b[i]){
                char t = a[i];a[i] = b[i];b[i] = t;swaps++; 
            }
            if(swaps==2) return String.valueOf(a) == String.valueOf(b);
        }
        System.out.println(String.valueOf(a));System.out.print(String.valueOf(b));
        return String.valueOf(a) == String.valueOf(b);
    }
}