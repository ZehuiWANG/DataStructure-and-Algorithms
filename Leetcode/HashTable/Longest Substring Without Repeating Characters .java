/*

Longest Substring Without Repeating Characters 

Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
*/
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int index=-1;
        
        char[] ss=s.toCharArray();
        
        Map<Character,Integer> conflict=new HashMap<>();
        
        for(int i=0;i<ss.length;i++){
            if(!conflict.containsKey(ss[i])){
                conflict.put(ss[i],i);
            }else{
                index=Math.max(index,conflict.get(ss[i]));
                conflict.put(ss[i],i);
            }
            maxlen=Math.max(maxlen,i-index);
        }
        return maxlen;
    }
}