/**
Merge Sorted Array 
Given two sorted integer arrays A and B, merge B into A as one sorted array.
*/

//java version:

public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int len=m+n-1;
        int i=m-1;
        int j=n-1;
        while(i>=0&&j>=0){
            if(A[i]>B[j]){
                A[len--]=A[i--];
            }else{
                A[len--]=B[j--];
            }
        }
        while(j>=0){//when the B.length>A.length
            A[len--]=B[j--];
        }
    }
}

//python version
class Solution:
    # @param A  a list of integers
    # @param m  an integer, length of A
    # @param B  a list of integers
    # @param n  an integer, length of B
    # @return nothing(void)
    def merge(self, A, m, B, n):
        i=m-1;
        j=n-1;
        k=m+n-1;
        
        while i>=0 and j>=0:
            if B[j]>A[i]:
                A[k]=B[j]
                k-=1
                j-=1
            else:
                A[k]=A[i]
                k-=1
                i-=1
        while j>=0:
            A[k]=B[j]
            j-=1
            k-=1