
//Implement atoi to convert a string to an integer.

//java version
public class Solution {
    public int atoi(String str) {
        if(str==null||str.length()<1){
            return 0;
        }
        
        str=str.trim();
        //use the double to store the result;
        double result=0;
        char flag='+';
        int i=0;
        //check the negative and positive
        if(str.charAt(0)=='-'){
            flag='-';
            i++;
        }else if(str.charAt(0)=='+'){
            i++;
        }
        
        //caculate value
        while(str.length()>i&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
            result=result*10+(str.charAt(i)-'0');
            i++;
        }
        
        if(flag=='-'){
            result=0-result;
        }
        //handle max and min
        if (result > Integer.MAX_VALUE)
		return Integer.MAX_VALUE;
 
	    if (result < Integer.MIN_VALUE)
		return Integer.MIN_VALUE;
        
        
        return (int)result;
    }
}
/*
int i = c -'0'
===========================================
就是将变量c的字符的ASCII码值与'0 '的ASCII码值相减就可以得到数字了。因为'0'的ASCII码值是48，'1'为49……'9'为57。相减就可以得到数值了。
*/