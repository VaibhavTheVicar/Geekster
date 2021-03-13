public class kthgrammar {
    public static void main(String[] args) {
        int N=4,K=5;
        System.out.println(kthGrammer(N,K));
    }

    public static int kthGrammer(int N,int K) {
        if(N==1 && K==1){
            return 0;
        }


        int ans;

        if(K%2 == 0){
            ans = 1-kthGrammer(N-1,K/2);
        }
        else
            ans = kthGrammer(N-1,(K+1)/2);
        
        return ans;
    }
}
