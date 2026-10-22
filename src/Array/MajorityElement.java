package Array;
class majorElement{
    public int majorityElement(int []nums){
   int count =0;
   int candidate = 0;
   for(int i=0;i<nums.length;i++){
       if(count==0)  candidate=nums[i];
       if(nums[i] == candidate) count++;
       else count--;
   }
   return candidate;
    }
}

public class MajorityElement {
   public static void main(String[] args) {
       int[] nums = {2, 2, 1, 2, 3, 2, 2};
       majorElement mj = new majorElement();
       int result = mj.majorityElement(nums);
       System.out.println("Majority Element is:"+result);

    }
}
