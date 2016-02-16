/**
Roman to Integer 
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.


*/

public class Solution {
    public int romanToInt(String s) {
        int [] value={1000,500,100,50,10,5,1};
        char[] symbol={'M','D','C','L','X','V','I'};
        
        int result=0;
        int last=0;
        
        for(int i=0;i<s.length();i++){
            for(int j=0;j<symbol.length;j++){
                if(symbol[j]==s.charAt(i)){
                    result=result+value[j];
                    if(last>j){
                      result=result-2*value[last];  
                    }
                    last=j;
                }
            }
        }
        return result;
    }
}

//python
class Solution:
    # @param {string} s
    # @return {integer}
    def romanToInt(self, s):
        dic = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        
        result=0
        for i in range(len(s)):
           if i>0 and dic[s[i]]>dic[s[i-1]]:
               result+=dic[s[i]]-2*dic[s[i-1]]
           else:
               result+=dic[s[i]]
        return result