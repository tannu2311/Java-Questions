import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args){
      int[] arr={4,3,5,2,1};
     System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[maxindex(arr,arr.length-1-i)]!=arr[arr.length-1-i ]){
                int temp=arr[maxindex(arr,arr.length-1-i)];
                arr[maxindex(arr,arr.length-1-i)]=arr[arr.length-1-i ];
                arr[arr.length-1-i ]=temp;}
        }
        return arr;
    }
    public static int maxindex(int [] arr, int n){
        int m=arr[0];
        int max=0;
        for(int i=1;i<=n;i++){
          if(arr[i]>m)
          {
            m=arr[i];
            max=i;
          }
        }
        return max;
    }
}
