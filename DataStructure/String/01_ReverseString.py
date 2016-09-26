"recursive
class Solution(object):
    def reverseString(self, s):
        """
            :type s: str
            :rtype: str
            """
        l = len(s)
        if l < 2:
            return s
        return self.reverseString(s[l/2:]) + self.reverseString(s[:l/2])


"classical method
class Solution(object):
    def reverseString(self, s):
        """
            :type s: str
            :rtype: str
            """
        r = list(s)
        i,j = 0, len(r) - 1
        while i < j:
            r[i],r[j] = r[j],r[i]
            i += 1
            j -= 1
        return "".join(r)

"SolutionPythonic
class Solution(object):
    def reverseString(self, s):
        """
            :type s: str
            :rtype: str
            """
        return s[::-1]
