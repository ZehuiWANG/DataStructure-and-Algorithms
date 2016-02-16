/*Jump Game
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.
*/

//solution 1:
public class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        //track the maximum length a position can reach 
        //1. when the position can not reach next step false
        //2. when the maximum can reach the end 
        if(n<=1){
            return true;
        }
        
        int max=nums[0];
        
        for(int i=0;i<n;i++){
            //if not enough to go to next
            if(max<=i&&nums[i]==0){
                return false;
            }
            
            //update max
            if(i+nums[i]>max){
                max=i+nums[i];
            }
            //max is enough to reach the end
            if(max>=n-1){
                return true;
            }
        }
        return false;
    }
}

// solution 2

public class Solution {
    public boolean canJump(int[] nums) {
        //can reach the point i i<=maxIndex
        //when reach the point manIndex=max(maxIndex,i+A[i]);
        //can reach the last point n-1  maxIndex>=n-1;
        
        int n=nums.length;
        int maxIndex=0;
        
        for(int i=0;i<n;i++){
            if(i>maxIndex||maxIndex>=(n-1)){
                break;
            }else{
                maxIndex=Math.max(maxIndex,i+nums[i]);
            }
        }
        
        return maxIndex>=(n-1)?true:false;
    }
}