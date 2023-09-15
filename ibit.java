import java.util.Scanner;

public class ibit {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        try{
        int n = in.nextInt();
        int i=in.nextInt();
        //System.out.println(ans(n,i));
        System.out.println(reset(n,i));
    }
    finally{
        in.close();
    }

    }
    public static  int ans(int n ,int i){
        int ans= n&(1<<i-1);
        if (ans!=0)
        return 1;
        else return 0;
        
    }
    public static int reset(int n , int i){
       int ans= 1<<i-1;
       return (n&(~(ans)));
    }
}
