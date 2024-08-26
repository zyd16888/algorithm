# @hw id=2023Q1A lang=python3
# 明明的随机数

n = int(input())
numset = set()

for i in range(n):
    numset.add(int(input()))

numlist = list(numset)
numlist.sort()

for i in numlist:
    print(i)
