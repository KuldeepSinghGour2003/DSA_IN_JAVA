package BubbleSort;


public class SelectionSortAlgorithm {
    public static void main(String[]args){
        int []arr={2,4,-8,-4,9,6,3,7,5};
        int n = arr.length;
        int index=-1;
        //int min=0;
        for(int i=0;i<n;i++){
            index=i;
            for(int j=i+1;j<n;j++) {
                if (arr[index] > arr[j]){
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
