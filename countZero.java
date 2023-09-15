public class countZero {
    public static void main(String[] args){
      int ans=rec(102020299);
      System.out.println(ans);
    }
    public static int rec(int n){
        if(n==0)
        return 0;
        if(n%10==0){
            return (1+rec(n/10));
        }
        return rec(n/10);
    }
}
