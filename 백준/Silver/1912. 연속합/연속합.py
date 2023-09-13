#1912
import sys
input = sys.stdin.readline

n = int(input())
l = list(map(int, input().split()))

for i in range(1, n):
    #이전까지 모든 숫자의 합 중 최대값
    l[i] = max(l[i], l[i] + l[i-1])

print(max(l))