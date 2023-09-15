import java.util.Scanner;

public class even {
    public static void main(String[] args){
        
        Scanner in=new Scanner(System.in);
        try{
        int n =in.nextInt();
        // if( (n & 1)==1)
        // System.out.println("number is odd");
        // else 
        // System.out.println("number is even");
        System.out.println(ans(n));
         }
        finally{
            in.close();
        }
        System.out.println(5^6);


        
    }
    public static int ans(int n ){
        return ((~n)+1);
    }
}
