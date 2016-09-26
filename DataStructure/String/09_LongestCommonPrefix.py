class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:
            return ""
        longest = strs[0]
        for item in range(len(strs[0])):
            for str in strs:
                if len(str) <= item or strs[0][item] != str[item]:
                    return strs[0][:item]
                    
        return strs[0]
        