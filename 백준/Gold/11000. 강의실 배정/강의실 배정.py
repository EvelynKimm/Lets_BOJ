#11000
#우선순위 큐를 이용한 자료형
import heapq
import sys

input = sys.stdin.readline

N = int(input())
queue = []

for i in range(N):
    start, end, = map(int, input().split())
    queue.append([start, end])

queue.sort()

room = []
heapq.heappush(room, queue[0][1])

for i in range(1, N):
    if queue[i][0] < room[0]:  #현재 회의실 끝나는 시간보다 다음 회의 시작시간이 빠르면
        heapq.heappush(room, queue[i][1]) #새로운 회의실 개설
    else: #현재 회의실에 이어서 회의 개최 가능한 경우
        heapq.heappop(room) #새로운 회의로 시간 변경 위해 pop 후, 새 시간 push
        heapq.heappush(room, queue[i][1])

print(len(room))