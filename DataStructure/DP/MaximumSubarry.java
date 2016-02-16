//Maximum Subarray 
/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [?2,1,?3,4,?1,2,1,?5,4],
the contiguous subarray [4,?1,2,1] has the largest sum = 6.
*/


public class Solution {
    public int maxSubArray(int[] nums) {
        //global[i]全局最优 i+1 global[i+1]=Math(local[i+1],global[i]);
        //Loacal[i]局部最优  i+1  local[i+1]=Math.max(A[i+1],local[i]+A[i+1]);
        if(nums==null||nums.length==0){
            return 0;
        }
        
        int global=nums[0];
        int local=nums[0];
        for(int i=1;i<nums.length;i++){
            local=Math.max(nums[i],local+nums[i]);
            global=Math.max(local,global);
        }
        
        return global;
    }
}