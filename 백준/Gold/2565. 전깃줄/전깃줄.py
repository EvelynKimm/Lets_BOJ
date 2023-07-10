#2565

import sys
input = sys.stdin.readline

N = int(input())
arr = []
dp = [1] * N

for i in range(N):
    a, b = map(int, input().split())
    arr.append([a,b])
    
arr.sort() # A의 번가 작은 순대로 정렬

for i in range(1, N):
    for j in range(0, i):
        if arr[j][1] < arr[i][1]: 
        #앞순서의 B가 뒷순서의 B보다 작은 경우에만 DP 카운팅을 늘림
        #즉, 교차된 줄이 없는 그룹의 최대(LIS)를 찾고
            dp[i] = max(dp[i], dp[j]+1)

#LIS를 N-LIS해주면 됨
print(N-max(dp))