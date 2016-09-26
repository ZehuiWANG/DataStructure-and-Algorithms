class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if haystack is None or needle is None:
            return 0
        lenh = len(haystack)
        lenn = len(needle)
        
        if lenn == 0:
            return 0
            
        for i in range(lenh - lenn + 1):
            j = 0
            while(j < lenn and haystack[i + j] == needle[j]):
                j += 1
            if j == lenn:
                return i;
        return -1