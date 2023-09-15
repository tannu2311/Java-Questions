import java.util.Scanner;

public class magicno {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        try{
            int n= input.nextInt();
            System.out.println(ans(n));
        }
        finally{
          input.close();  
        }
    }
    public static int ans(int n ){
        int a=0;
        int i=1;
        while(n!=0){
        a=(n&1)*(int)(Math.pow(5,i))+a;

        n=n>>1;
        i++;
        }
        return a;
    }
}
