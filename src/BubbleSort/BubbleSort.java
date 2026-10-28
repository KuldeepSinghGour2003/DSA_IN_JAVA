package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,1,9,8,4,7,5,6};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++){
            int swap =0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
