#1744

import sys
input = sys.stdin.readline

N = int(input())
positive = []
negative = []
sum = 0

for _ in range(N):
    n = int(input())

    if n > 1:
        positive.append(n)
    elif n <= 0:
        negative.append(n)
    else:
        sum += n

positive.sort(reverse=True)
negative.sort()

for i in range(0, len(positive), 2):
    #하나만 남는 것들(홀수)은 그냥 더해줌
    if i+1 >= len(positive):
        sum += positive[i]
    else:
        sum += (positive[i]*positive[i+1])

for i in range(0, len(negative), 2):
    #하나만 남는 것들(홀수)은 그냥 더해줌
    #0이 negative 리스트로 들어왔기 때문에 더해지거나
    #남는 음수값과 곱해진다
    if i+1 >= len(negative):
        sum += negative[i]
    else:
        sum += (negative[i]*negative[i+1])

print(sum)