/**
Majority Element 
Given an array of size n, find the majority element. The majority element is the element that appears more than ? n/2 ? times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/

//python
class Solution:
    # @param {integer[]} nums
    # @return {integer}
    def majorityElement(self, nums):
        num=sorted(nums)
        return num[len(nums)/2] 
		
//java
public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
        