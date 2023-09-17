#2579

import sys
input = sys.stdin.readline


n = int(input())
step = [int(input()) for _ in range(n)]
dp = [0] * (n)

#계단이 2개 이하일 땐 그냥 다 더해서 출력
if len(step) <= 2:
    print(sum(step))

#계단이 3개 이상일 때
#dp리스트에는 각 인덱스에 최대 점수가 들어감
#dp[0]에는 첫번째 계단까지의 최대 점수, dp[1]에는 두번째 계단까지의 최대 점수가 들어감
else:
    dp[0] = step[0] #첫째 계단의 경우
    dp[1] = step[0] + step[1] #둘째 계단 수동 계산

    for i in range(2, n): #셋째 계단부터 dp점화식 이용해 최대값 구하기
        dp[i] = max(dp[i-3] + step[i-1]+step[i], dp[i-2] + step[i])
    #i-3까지의 계단 점수 최댓값과 i-1, i 계단의 합
    #i-2까지의 계단 점수 최댓값과 i 계단의 합

    print(dp[-1])