//Jump Game II 
/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

For example:
Given array A = [2,3,1,1,4]

The minimum number of jumps to reach

*/


public class Solution {
    public int jump(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        
        int lastReach=0;
        int reach=0;
        int step=0;
        
        for(int i=0;i<=reach&&i<nums.length;i++){
            if(i>lastReach){
                step++;
                lastReach=reach;
            }
            reach=Math.max(reach,nums[i]+i);
        }
        
        if(reach<nums.length-1){
            return 0;
        }
        return step;
    }
}