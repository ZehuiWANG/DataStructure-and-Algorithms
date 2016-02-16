//implement strStr()

//java version:

public class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack==null||needle==null){
            return 0;
        }
        if(needle.length()==0){
            return 0;
        }
        int hlen=haystack.length();
        int nlen=needle.length();
        
        
        for(int i=0;i<=hlen-nlen;i++){
            int j=0;
            while(j<needle.length()&&needle.charAt(j)==haystack.charAt(i+j)){
                j++;
            }
            if(j==nlen){
                return i;
            }
            
        }
     return -1;   
    }
}