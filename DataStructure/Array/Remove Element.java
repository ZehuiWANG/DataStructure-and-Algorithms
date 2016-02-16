
/**Remove Element
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.*/
//java V1.1
public class Solution {
    public int removeElement(int[] A, int elem) {
        int n=A.length;
        int newArray=0;
        if(n==0){
            return 0;
        }
        for(int i=0;i<n;i++){
            if(A[i]!=elem){
                A[newArray]=A[i];
                newArray++;
            }
        }
        return length;
    }
}
//python V1.1
class Solution:
    # @param    A       a list of integers
    # @param    elem    an integer, value need to be removed
    # @return an integer
    def removeElement(self, A, elem):
         while elem in A: 
             A.remove(elem)
         return len(A)