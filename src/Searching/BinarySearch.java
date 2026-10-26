package Searching;

public class BinarySearch {
    public static void main(String[]args){
        int []arr = {-5,-4,-3,-2,-1,0,0,1,2,3,4,5,6};
        int n=arr.length;
        int low=0,high = n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=0){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
         low=0;
         high = n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=0){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        int positivecount = n- low;
        int negcount = low;
        System.out.print("Positive element in an Array is:"+positivecount+"\n"+"Negative  element in an Array is:"+negcount);
    }

}
