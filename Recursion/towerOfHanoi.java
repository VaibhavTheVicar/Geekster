package Recursion;

public class towerOfHanoi {
    public static void main(String[] args) {
        toi(3,'A','B','C');
    }

    static void toi(int n, char s,char d,char h){
        if(n==1)
            System.out.println(s+"->"+d);
        else
            {toi(n-1,s,h,d);
            System.out.println(s+"->"+d);
            toi(n-1,h,d,s);}
    }
}
