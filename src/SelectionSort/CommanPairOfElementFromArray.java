package SelectionSort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CommanPairOfElementFromArray {
    public static ArrayList<Integer> common(int []arr1,int []arr2){
        int i=0,j=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else if(arr1[i]>arr2[j])
                j++;
        }
        return ans;
    }
    public static void main(String[]args){
        int []arr1 = {2,2,2,8,7,9,6,1};
        int []arr2 = {9,1,3,5,8,4,6,2};
        ArrayList<Integer> a1 = common(arr1,arr2);
        System.out.println("Sorted Pair of Element:"+a1);

    }
}
