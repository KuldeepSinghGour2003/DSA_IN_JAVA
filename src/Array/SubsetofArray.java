package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetofArray {
    static  void printsubSet(int []arr, int index, List<Integer> subset){
        System.out.println(subset);
        for(int i=index;i<arr.length;i++){
            subset.add(arr[i]);
            printsubSet(arr,i+1,subset);
            subset.remove(subset.size()-1);
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");

        int n = sc.nextInt();
        int []arr = new int[n];
//        int []arr = {1,2,3};
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        printsubSet(arr,0,new ArrayList<>());
    }
}
