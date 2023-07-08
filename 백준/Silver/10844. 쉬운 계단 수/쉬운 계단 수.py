#10844

import sys
input = sys.stdin.readline

N = int(input())

dp = [[0] * 10 for _ in range(N+1)]
for i in range(1, 10):
    dp[1][i] = 1
    
MOD = 1000000000

for i in range(2, N+1):
    for j in range(10):
        if j == 0: #가장 뒤에 오는 숫자가 0일 때
            dp[i][j] = dp[i-1][1]
            #0의 앞엔 1만 올 수 있기 때문
        elif j == 9:  #가장 뒤에 오는 숫자가 1~8일 때
            dp[i][j] = dp[i-1][8]
            #1~8의 앞엔 +-1이 올 수 있기 때문
        else:  #가장 뒤에 오는 숫자가 9일 때
            dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1]
            #9의 앞엔 8만 올 수 있기 때문
            
print(sum(dp[N]) % MOD)