package Recursion;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr,int target,int high, int low){
        int mid = (high+low)/2;
        if(low>high) return -1;
        if(target==arr[mid]) return mid;
        if(arr[mid]>target){
         return binarySearch(arr,target,mid-1,low);
        }else{
            return binarySearch(arr,target,high,mid+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Search Element:");
        int target = sc.nextInt();

        int r=  binarySearch(arr,target,arr.length-1,0);
        if(r!=-1){
            System.out.println("Element is found at index "+ r);
        }else{
            System.out.println("Element is not found!");
        }
    }
}
