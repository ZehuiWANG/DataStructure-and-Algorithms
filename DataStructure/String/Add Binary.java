/**
Add Binary 
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100"
*/

//java version:
public class Solution {
    public String addBinary(String a, String b) {
        if(a==null||a.length()==0){
            return  b;
        }if(b==null||a.length()==0){
            return a;
        }
        StringBuilder sb=new StringBuilder();
        int sum=0;
        int lastA=a.length()-1;
        int lastB=b.length()-1;
        int carry=0;
        
        while(lastA>=0||lastB>=0||carry>0){
            int num1=(lastA>=0)?a.charAt(lastA--)-'0':0;
            int num2=(lastB>=0)?b.charAt(lastB--)-'0':0;
            sum=num1+num2+carry;
            carry=sum/2;
            sb.append(sum%2);
        }
        return sb.reverse().toString();
    }
}