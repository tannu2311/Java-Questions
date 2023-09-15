import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
       
        try{
        int a= input.nextInt();
        int n=(int)(Math.log(a)/Math.log(2));
        System.out.println(n+1);
    }
    finally{
        input.close();
    }
   
    }
}
