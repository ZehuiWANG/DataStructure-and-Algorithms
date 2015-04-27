/**
Rotate Array 
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

[show hint]

Hint:
Could you do it in-place with O(1) extra space?
*/
//java 
//1.1
public class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;//题目里面没有限定k的大小，所以k可以比n大。程序里面需要进行预处理，使之缩小到0 – //n-1的范围内。
        int [] temp=new int[n];
         if(n!=0||n!=1){
        for(int i=0;i<k;i++){
            temp[i]=nums[n-k+i];
        }for(int i=k;i<n;i++){
            temp[i]=nums[i-k];
        }
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}
//1.2 using the reverse method;
public class Solution {
    public void rotate(int[] nums, int k) {
       int n=nums.length;
       k=k%n;
       if(k!=0){
           reverse(nums,0,n-k-1);
           reverse(nums,n-k,n-1);
           reverse(nums,0,n-1);
       }
    }
    void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
//python
//1.1
class Solution:
    # @param nums, a list of integer
    # @param k, num of steps
    # @return nothing, please modify the nums list in-place.
    def rotate(self, nums, k):
        n=len(nums)
        k=k%n
        nums[:]=nums[n-k:]+nums[:n-k]
		
//1.2
class Solution:
    # @param nums, a list of integer
    # @param k, num of steps
    # @return nothing, please modify the nums list in-place.
    def rotate(self, nums, k):
        while k>0:
            nums.insert(0,nums.pop())//Insert a new item with value x in the array before //position i. 
			//array.pop(i) Removes the item with the index i from the array and returns it.
            k-=1		

        