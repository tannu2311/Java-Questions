import java.util.Scanner;

public class PascalRowSum {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        try{
            int n= in.nextInt();
            int ans= 1<<(n-1);
            System.out.println(ans);
        }
        finally{
            in.close();
        }
    }
}
