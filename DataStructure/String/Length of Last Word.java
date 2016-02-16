/**
Length of Last Word
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

For example, 
Given s = "Hello World",
return 5.
*/

//java version 1.1 using toChar(i);
public class Solution {
    public int lengthOfLastWord(String s) {
        String ss=s.trim();
		//.trim() This method returns a copy of the string, with leading and trailing //whitespace omitted.
        
        int len=ss.length();
        int result=0;
        for(int i=len-1;i>=0;i--){
            if(ss.charAt(i)!=' '){
                result++;
            }else{
                break;
            }
        }
        return result;
    }
}

//java version 1.2 using toCharArray();

public class Solution {
    public int lengthOfLastWord(String s) {
        char[] ss=s.trim().toCharArray();
        
        int len=ss.length-1;
        int result=0;
        for(int i=len;i>=0;i--){
            if(ss[i]!=' '){
                result++;
            }else{
                break;
            }
        }
        return result;
    }
}

//python is powerful:
class Solution:
    # @param {string} s
    # @return {integer}
    def lengthOfLastWord(self, s):
        s_split=s.split()
        if len(s_split)==0:
            return 0
        else:
            return len(s_split[-1])