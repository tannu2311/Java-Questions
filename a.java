import java.util.ArrayList;
import java.util.Scanner;

public class a {
    public static void main (String[] args)
    { 
    Scanner input= new Scanner(System.in);
    try{
      int i=0;
      ArrayList<Integer> arr= new ArrayList<>(5);
      for( ;i<5;i++){
        arr.add(input.nextInt());
      }
      System.out.println(ans(arr));}
      finally{
        input.close();
      }
      

    }
    public static int ans(ArrayList<Integer> arr){
        int a=arr.get(0);
    for (int i=1;i<5;i++){
  a=a ^ arr.get(i);
    }
        return a;
    }
}
