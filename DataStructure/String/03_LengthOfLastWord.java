//length of the last word
public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        char [] str = s.toCharArray();
        int len = str.length;
        int lastLen = 0;
        for(int i = 0; i < len;i++){
            if(str[len - 1 - i] != ' '){
                lastLen ++;
            }else{
                break;
            }
        }
        return lastLen;
    }
}

//
public class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null|| s.length() == 0){
            return 0;
        }
        int len = s.length();
        int count = 0;
        for(int i  = len - 1; i>=0; i--){
            if(s.charAt(i) != ' '){
                count++;
            }
            if(s.charAt(i) == ' '&& count != 0){
                return count;
            }
        }
        return count;
    }
    //
public class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        if(str == null || str.length == 0){
            return 0;
        }
        return str[str.length - 1].length();
    }
}
}