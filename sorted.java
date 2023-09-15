public class sorted {
    public static void main(String[] args){
int[] arr ={1,2,8,4};
System.out.println(ifSorted(arr,0));
    }
    public static boolean ifSorted(int[] arr, int s){
        if(s==arr.length-1)
        return true;
        return ((arr[s]<arr[s+1] && ifSorted(arr,s+1)));
    
    }
}

