import java.util.Scanner;

public class RightSetbitPos {
    public static void main(String[] args){

        Scanner in= new Scanner(System.in);
        try{
        int n = in.nextInt();
        int a=(n&(-n))/2;
        System.out.println(a);
        }
        finally{
            in.close();
        }


    }
}
