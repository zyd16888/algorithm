class Solution:
    """
    颠倒数的二进制位
    """
    def reverseBits(self, n):
        ret, power = 0, 31
        while n:
            ret += (n & 1) << power
            n = n >> 1
            power -= 1
        return ret
    pass

if __name__ == "__main__":
    test = Solution()
    n = 43261596
    res = test.reverseBits(n)
    print(res)