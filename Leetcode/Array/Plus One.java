/**
Plus one
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
*/

//java
public class Solution {
    public int[] plusOne(int[] digits) {
        int length=digits.length;
        for(int i=length-1;i>=0;i--){
            if(digits[i]<9){       
                //if the last digit is not equal to 9, then we directly plus 1 and return the answer
                digits[i]++;
                break;
            }else{
                //else the digit9+1=0;
                digits[i]=0;
            }
        }
        int [] result;
        //if the final we found the whole digtis are equal 0 we need add more space in the front of them to equal //this to 1
        if(digits[0]==0){
            result=new int[digits.length+1];
            result[0]=1;
            for(int i=1;i<result.length;i++){
                result[i]=digits[i-1];
            }
            return result;
        }else{
        //if the first element is not equal to 0; we just return this digits
            return digits;
            }
        }
    }
	
//python
class Solution:
    # @param {integer[]} digits
    # @return {integer[]}
    def plusOne(self, digits):
        carry=1;
        i=len(digits)-1
        while carry and i>=0:
            d=digits[i]+carry
            carry=d/10
            digits[i]=d%10
            i-=1
        if carry:
            return [1]+digits
        else:
            return digits
        