//contains duplicate
/*
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

*/

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap map=new HashMap();
        
        if(nums==null){
            return false;
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}