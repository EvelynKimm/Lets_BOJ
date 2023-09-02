#11651
import sys

input = sys.stdin.readline

N = int(input())
point = []

for i in range(N):
    point.append(list(map(int, input().split())))

#두번째 세로줄부터 정렬해야하므로 a[1], a[0] 순서임
point.sort(key = lambda a: (a[1], a[0]))

for i in point:
    print(i[0], i[1])
