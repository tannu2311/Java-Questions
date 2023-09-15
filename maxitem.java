import java.util.ArrayList;
import java.util.Scanner;

public class maxitem {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(5);
        Scanner input= new Scanner(System.in);
        try{
        System.out.println("Enter number of elements:");
        int in= input.nextInt();
        int i=0;
        while(i<in){
          arr.add(input.nextInt());
          i++;
        }}
        finally{
            input.close();
        }
      System.out.println("the max element is:");
      System.out.println(maxi(arr));
    }
    static int maxi(ArrayList<Integer> arr){
        int max=arr.get(0);
        int i=1;
        while(i<arr.size()){
            if(max<arr.get(i)){
                max=arr.get(i);
            }
            i++;
        }
     return max; 
    }
}
