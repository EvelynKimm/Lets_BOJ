#11053
import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split()))
dp = [0 for i in range(N)]

#현재위치(i)가 이전위치(j)보다 큰지 확인하는 반복문
for i in range(N):
    for j in range(i):
        #크다면, 그 위치에 dp+=1
        #단, 현위치의 dp[i]가 dp[j]보다 작은 경우에만 (0, 1 idx 때문일지도)
        if arr[i] > arr[j] and dp[i] < dp[j]:
            dp[i] = dp[j]
    dp[i] += 1
    
print(max(dp))