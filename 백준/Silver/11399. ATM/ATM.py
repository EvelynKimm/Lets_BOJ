#1744

import sys
input = sys.stdin.readline

N = int(input())

order = list(map(int, input().split()))

order.sort()
ans = 0

for i in range(1, N+1):
    #슬라이스를 이용해 하나씩 늘려가면서 합을 저장해 더할 수 있음
    ans += sum(order[0:i]) 

print(ans)