package SelectionSort;

import java.util.Arrays;

public class MoveAllZerotoEnd {
    public static void main(String[]args){
        int[] arr = {2,0,3,0,9,0,7,0,5,6};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
