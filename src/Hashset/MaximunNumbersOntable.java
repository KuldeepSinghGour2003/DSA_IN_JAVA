package Hashset;

import java.util.HashSet;

public class MaximunNumbersOntable {
    public int maximunNumbersOntable(int []bag){
        HashSet<Integer>  table = new HashSet<>();
        int max =0;
        for(int i=0;i<bag.length;i++){
            int num = bag[i];
            if(table.contains(num)){
                table.remove(num);
            }else{
                table.add(num);
                max = Math.max(max,table.size());
            }
        }
        return max;
    }
    public static void main(String[]args){
        MaximunNumbersOntable mn = new MaximunNumbersOntable();
        int []arr = {2,1,1,3,2,3,5,8,9,8,9,5};
        System.out.println("Number on table :" + mn.maximunNumbersOntable(arr));
    }
}
