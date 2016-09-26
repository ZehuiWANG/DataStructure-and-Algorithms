class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        res = list(s)
        vowels = ['a','e','i','o','u']
        start = 0;
        end = len(s) - 1
        while start < end:
            while start < end and (s[start].lower() not in vowels):
                start += 1
            while start < end and (s[end].lower() not in vowels):
                end -= 1
            if(start != end):
                temp = res[start]
                res[start] = res[end]
                res[end] = temp
            start += 1
            end -= 1
        return ''.join(res)
        