//dic
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for(int i = 0;i < magazine.length();i++){
            arr[magazine.charAt(i) - 'a']++;
        }
        for(int i = 0; i < ransomNote.length();i++){
            if(--arr[ransomNote.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}



//classical method
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransoms = ransomNote.toCharArray();
        char[] magazines = magazine.toCharArray();
        for(int i = 0; i < ransoms.length;i++){
            for(int j = 0; j < magazines.length;j++){
                if(ransoms[i] == magazines[j]){
                    ransoms[i] =0;
                    magazines[j] =0;
                    break;
                }
            }
        }
        for(char r: ransoms){
            if(r != 0){
                return false;
            }
        }
        return true;
    }
}