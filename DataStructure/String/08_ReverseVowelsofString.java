public class Solution {
    public String reverseVowels(String s) {
        int len = s.length();
        char[] chs = s.toCharArray();
        int i = 0, j = len - 1;
        while(i < j){
            if(!isVowels(chs[i])){
                i++;
                continue;
            }
            if(!isVowels(chs[j])){
                j--;
                continue;
            }
            char temp = chs[i];
            chs[i] = chs[j] ;
            chs[j] = temp;
            i++;
            j--;
            
        }
        return new String(chs);
    }
    public boolean isVowels(char c){
        if ('a' == c || 'e' == c || 'i' == c || 'o' == c || 'u' == c
                || 'A' == c || 'E' == c || 'I' == c || 'O' == c || 'U' == c) {
            return true;
        }
        return false;
    }
}