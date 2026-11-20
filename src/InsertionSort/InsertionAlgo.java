package InsertionSort;

public class InsertionAlgo {
    public static void main(String[]args){
        int []arr = {2,5,4,8,6,9,3,1};
        for(int i=1;i<arr.length;i++){
              int j=i;
              while(j>0 && arr[j]<arr[j-1]){
                  int temp = arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;
                  j--;
              }
        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(" "+arr[i]);
//        }
        for(int ele : arr){
            System.out.print(" "+ele);
        }
    }
}
