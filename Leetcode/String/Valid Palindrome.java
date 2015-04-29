/***
Valid Palindrome
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
*/

//java version  replaceAll("\\W","")
public class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("\\W","").toLowerCase();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
            
        }
        return true;
    }
}
//java version 1.2 replaceAll("[^a_zA_Z0_9]","")
public class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        int i=0;
        int j=s.length()-1;
        
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}


//python:

class Solution:
    # @param s, a string
    # @return a boolean
    def isPalindrome(self, s):
        pattern = re.compile('[\W_]+')
        A=pattern.sub('', s.lower())
        if A==A[::-1]:
            return True
        else:
            return False