package SelectionSort;

import java.util.Arrays;

public class SumoftwoPairin_array {
   static public int Sum(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) return 1;
            else if (arr[i] + arr[j] < target) i++;
            else if (arr[i] + arr[j] > target) j--;
        }
        return 0;
    }

    public static void main(String[]args){
        int []arr={2,4,8,4,9,6,3,7,5};
        int target = 9;
        int s=Sum(arr, 9);
        System.out.println(s);// 1  Denote Pair found
    }
}
