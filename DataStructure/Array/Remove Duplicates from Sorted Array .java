/**Remove Duplicates from Sorted Array
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2].
*/
//java
public class Solution {
    public int removeDuplicates(int[] A) {
        int n=A.length;
        int j=0;
        if(n==0){
            return 0;
        }
        for(int i=1;i<n;i++){
            if(A[i]!=A[j]){
                A[j+1]=A[i];
                j++;
            }
        }
        return j+1;
    }
}

//python
class Solution:
    # @param a list of integers
    # @return an integer
    def removeDuplicates(self, A):
        if len(A)==0:
            return 0
        j=0
        for i in range(1,len(A)):
            if A[i]!=A[j]:
                A[j+1]=A[i]
                j=j+1
        return j+1