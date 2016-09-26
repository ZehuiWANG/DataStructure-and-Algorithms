public class Solution {
    public String addBinary(String a, String b) {
        if(a == null || a.length() == 0){
            return b;
        }
        if(b == null || b.length() == 0){
            return a;
        }
        StringBuffer sb = new StringBuffer();
        int sum = 0;
        int carry = 0;
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        while( lenA >= 0 || lenB >= 0 || carry > 0){
            int num1 = (lenA >= 0) ? a.charAt(lenA--) - '0': 0;
            int num2 = (lenB >= 0) ? b.charAt(lenB--) - '0': 0;
            sum = carry + num1 + num2;
            carry = sum/2;
            sb.append(sum%2);
        }
        return sb.reverse().toString();
    }
}