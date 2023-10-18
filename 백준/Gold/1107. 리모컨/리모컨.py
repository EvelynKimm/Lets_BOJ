#1744
import sys
input = sys.stdin.readline

N = int(input())
ans = abs(100 - N)
M = int(input())
if M: #고장난 게 있을 때만 인풋 받음
    broken = set(input().split())
else: 
    broken = set()

#작은수->큰수 이동은 500,000까지만 보면 되지만
#반대로 큰수->작은수로 내려올 수도 있으므로 1,000,000까지 봐야함

for num in range(1000001):
    for i in str(num):
        if i in broken: #해당 숫자를 눌러서 만들 수 없는 경우
            break
    else: #번호 눌러서 만들 수 있는 경우
        #(기존 답)과 (번호를 누른횟수 + 해당번호부터 타겟까지의 차이) 중 최소
        ans = min(ans, len(str(num)) + abs(num-N))

print (ans)
