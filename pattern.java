public class pattern {
    public static void main(String[] args){
    ans(4,0);
    }
    public static void ans(int n , int c){
            if(c>=n)
            return;
            for(int i=0;i<=c;i++)
                System.out.print("*");
            
            System.out.println("");;
            ans(n,c+1);
        
    }
}
