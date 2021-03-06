public class Solution {
    public int myAtoi(String str) {
        if(str==null||str.length()<1){
            return 0;
        }
        //trim with space
        str=str.trim();
        
        char flag='+';
        //check the negative or positive
        int i=0;
        if(str.charAt(0)=='-'){
            flag='-';
            i++;
        }else if(str.charAt(0)=='+'){
            i++;
        }
        
        //use the double to store result;
        double result=0;
        while(str.length()>i&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
            result=result*10+(str.charAt(i)-'0');
            i++;
        }
        //check the negative agian
        
        if(flag=='-'){
            result=0-result;
        }
         //handle max and min
        if(result>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        
        if(result<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        
        
        return (int)result;
        
    }
}