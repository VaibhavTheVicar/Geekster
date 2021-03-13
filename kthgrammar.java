public class kthgrammar {
    public static void main(String[] args) {
        int n = 4;
        int k = 5;
        System.out.println(kthGrammar(n,k));
    }
    public static int kthGrammar(int N, int K) {
        if(N==1 && K==1){
            return 0;
        }
        int ans;
        if(K%2==0)
            ans =  1-kthGrammar(N-1,K/2);
        else
            ans = kthGrammar(N-1,(K+1)/2);
        return ans;


    }
}
