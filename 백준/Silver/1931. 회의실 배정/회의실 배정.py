#1931
import sys

input = sys.stdin.readline

N = int(input())
time = []

for i in range(N):
    start, end, = map(int, input().split())
    time.append([start, end])

time = sorted(time, key = lambda a:a[0]) #start기준으로 오름차순 정렬
time = sorted(time, key = lambda a:a[1]) #end기준으로 오름차순 정렬
#2차원 요소를 기준으로 정렬할 때 sorted(list, key = lambda a:a[n]) 사용

last_end = 0
cnt = 0

for start, end in time:
    if start >= last_end:
        cnt += 1
        last_end = end

print(cnt)