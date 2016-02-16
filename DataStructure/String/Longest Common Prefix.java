/**
Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
*/
//java version:
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            while(j<prefix.length()&&j<strs[i].length()&&strs[i].charAt(j)==prefix.charAt(j)){
                j++;
            }
            prefix=prefix.substring(0,j);
        }
        return prefix;
    }
}

//python version
class Solution:
    # @param {string[]} strs
    # @return {string}
    def longestCommonPrefix(self, strs):
        if strs==[]:
            return ''
        for i in range(len(strs[0])):
            for j in range(len(strs)):
                if len(strs[j])<=i or strs[j][i]!=strs[0][i]:
                    return strs[0][:i]
        return strs[0]
        
