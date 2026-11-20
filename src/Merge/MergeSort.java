package Merge;

public class MergeSort{
    public static void mergeSort(int []arr){
        int n = arr.length;
        if(n==1) return ;
        int []a = new int[n/2];
        int []b = new int[n-n/2];
        int idx = 0;
        for(int i=0;i<a.length;i++){
            a[i] = arr[idx];
            idx++;
        }
        for(int i=0;i<b.length;i++){
            b[i] = arr[idx];
            idx++;
        }

        //Recursion uesd
        mergeSort(a);
        mergeSort(b);

        merge(a,b,arr);
    }
    private static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {   //a[i]>b[j]
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
    }
    public static void main(String[]args) {
        int[] arr = {5, 2, 4, 8, 5, 3, 1, 9, };
        mergeSort(arr);
        for(int ele : arr){
            System.out.print("MergeSort Element: "+ele+" ");
        }
    }
}
