/**
Compare Version Numbers/
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
*/\
//java version:

public class Solution {
    public int compareVersion(String version1, String version2) {
       //The tricky part of the problem is to handle cases like 1.0 and 1. They should be equal.
        String[] arr1=version1.split("\\.");
        String[] arr2=version2.split("\\.");

        
        int i=0;
        while(i<arr1.length||i<arr2.length){
                if(i<arr1.length&&i<arr2.length){
                    if(Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])){
                        return -1;
                    }else if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])){
                         return 1;
                    }
                }else if(i<arr1.length){
                    if(Integer.parseInt(arr1[i]) != 0){
                         return 1;
                    }
                }else if(i<arr2.length){
                    if(Integer.parseInt(arr2[i]) != 0){
                         return -1;
                    }
                }
             i++;
        }
        return 0;
    }
}

//python version:
class Solution:
    # @param {string} version1
    # @param {string} version2
    # @return {integer}
    def compareVersion(self, version1, version2):
        v1Arr = version1.split(".")
        v2Arr = version2.split(".")
        len1 = len(v1Arr)
        len2 = len(v2Arr)
        lenMax = max(len1, len2)
        for x in range(lenMax):
            v1Token = 0
            if x < len1:
                v1Token = int(v1Arr[x])
            v2Token = 0
            if x < len2:
                v2Token = int(v2Arr[x])
            if v1Token < v2Token:
                return -1
            if v1Token > v2Token:
                return 1
        return 0