#1068
import sys
input = sys.stdin.readline

def DFS(n, L):
    L[n] = -2 #-2로 바꿈 (인덱스의 배열값 삭제의 의미)
    #배열 전체를 탐색하며 방금 삭제한 인덱스를 부모노드로 가지는 노드 찾아 dfs함수 재귀호출
    for i in range(len(L)):
        if n == L[i]:
            DFS(i, L)

N = int(input())
L = list(map(int, input().split())) #부모 노드가 담긴 리스트
k = int(input())
cnt = 0

#재귀가 끝났으므로 삭제될 노드들은 전부 -2로 갱신되어 있음
DFS(k, L)
cnt = 0
for i in range(len(L)):
    #즉, -2가 아니면서 해당 노드가 부모노드 리스트에 없는 경우 cnt를 1씩 늘림
    if L[i] != -2 and i not in L:
        cnt+=1

print(cnt)
