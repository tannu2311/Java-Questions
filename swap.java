import java.util.Scanner;
public class swap{
    public static void main(String[] args){
    int [] arr= new int[5];
    Scanner in=new Scanner(System.in);
    try{int i=0;
    while(i<5){
     arr[i]=in.nextInt();
     i++;
    }}
    finally{
        in.close();
    }
    int[] ans=swa(arr,1,3);
    int i=0;
    while(i<5){
        System.out.println(ans[i]);
        i++;
    }

    }
    static int[] swa(int[] arr,int a, int b){
     int temp=arr[a];
     arr[a]=arr[b];
     arr[b]=temp;
     return arr;
    }
}