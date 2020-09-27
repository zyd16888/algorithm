# 3. 无重复字符最长字串
# https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/

class Solution:
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        st = {}
        i, ans = 0, 0
        for j in range(len(s)):
            if s[j] in st:
                i = max(st[s[j]], i)
            ans = max(ans, j - i + 1)
            # 修改对应字符的索引值
            st[s[j]] = j + 1
        return ans

if __name__ == "__main__":
    test = Solution()
    str1 = "abcabcbb"
    res = test.lengthOfLongestSubstring(str1)
    print(res)