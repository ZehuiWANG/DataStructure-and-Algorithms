//recursion O(logn)
public class Solution {
    public String reverseString(String s) {
        if(s.length() <= 1){
            return s;
        }
        String leftStr = s.substring(0,s.length()/2);
        String rightStr = s.substring(s.length()/2,s.length());
        return reverseString(rightStr) + reverseString(leftStr);
    }
}
//half length O(n/2)
public class Solution {
    public String reverseString(String s) {
        char[] ch = s.toCharArray();
        int halfLength = s.length()/2;
        char temp;
        for(int i = 0; i < halfLength; i++){
            temp = ch[s.length() - 1 - i];
            ch[s.length() - 1 - i] = ch[i];
            ch[i] = temp;
        }
        return new String(ch);
    }
}