public class recBSE {
    public static void main(String[] args){
     int [] arr={2,5,7,9,10};
     System.out.println(ans(arr,7,0,arr.length-1));
    }
    public static int ans(int[] arr, int target, int start,int end){
        int mid= start -(start-end)/2;
        if(start<=end){
        if(arr[mid]==target)
        return mid;
        else if(arr[mid]>target)
        return ans(arr,target,start,mid-1);
        return ans(arr,target,mid+1,end);}
        return -1;

    }
    
}
