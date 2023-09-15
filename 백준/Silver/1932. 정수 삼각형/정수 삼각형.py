#1149
import sys
input = sys.stdin.readline

n = int(input())
dp = []
for i in range(n):
    dp.append(list(map(int, input().split())))

for i in range(1, n):
    for j in range(len(dp[i])):
        #각 라인의 처음
        if j==0:
            dp[i][j] = dp[i][j] +dp[i-1][j]
        #각 라인의 끝
        elif j==len(dp[i])-1:
            dp[i][j] = dp[i][j] +dp[i-1][j-1]
        #각 라인의 중간 부분들
        #왼쪽 대각선, 오른쪽 대각선 중 최댓값을 더해나가서 이전의 값과 더해주면 최댓값
        else:
            dp[i][j] = max(dp[i-1][j-1], dp[i-1][j])+dp[i][j]

print(max(dp[n-1]))