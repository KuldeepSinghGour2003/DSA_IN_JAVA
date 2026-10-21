package Array;

public class EquilibriumIndex {
    public static int equilibriumIndexSum(int arr[]){
        int totalSum = 0;
        for(int X:arr){
            totalSum+=X;
        }
        int leftSum=0;
        for(int i =0;i<arr.length;i++){
            int rightSum = totalSum-leftSum-arr[i];
            if(leftSum==rightSum) return i;
            leftSum+=arr[i];
        }
        return -1;
    }

    public static void main(String[]args) {
        int []arr = {1, 2, 3, 6, 3, 2, 1};

        int index = equilibriumIndexSum(arr);
        System.out.println("The Index at which equilibrium sum is present : "+ index);

    }
}
