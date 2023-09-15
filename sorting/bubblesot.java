package sorting;
import java.util.Arrays;

public class bubblesot {
    public static void main(String[] args){
int [] arr={4,10,2,3,1};
System.out.println(Arrays.toString(recSort(arr,0,arr.length)));
    }
    public static int[] sort(int []arr){
     for(int i=0;i<arr.length-1;i++){
        boolean ifswap=false;
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                ifswap=true;
            }
        }
        if(ifswap==false)
        break;
     }
     return arr;
    }
public static int[] recSort(int [] arr,int r , int c){
    boolean ifsort=false;
    if(r<arr.length-1 ){
    for(int i=0;i<c-1;i++){
        if (arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            ifsort=true;
        }
    }}
    if(ifsort==false)
    return arr;
    return recSort(arr,r+1,c-1);
}}
   