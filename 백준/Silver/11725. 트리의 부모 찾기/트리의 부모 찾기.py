import sys

input = sys.stdin.readline
sys.setrecursionlimit(10**9) #기본적으로 반복은 1000회이므로 늘려줘야함

N = int(input()) #노드의 개수

Tree = [[] for _ in range(N+1)]  #트리
Parents = [-1] * (N+1) #기본값을 -1로 설정해주는 것

#트리 구조 입력
for _ in range(N-1):
    a, b = map(int, input().split())
    Tree[a].append(b)
    Tree[b].append(a)

def DFS (n):
    #연결된 노드들부터 Parents[i]의 부모가 없으면 부모 설정해주고 DFS 돌림
    for i in Tree[n]:
        if Parents[i] == -1: #-1임을 통해 방문되지 않았음을 확인할 수 있음
            Parents[i] = n
            DFS(i)

DFS(1)  #트리의 root를 1으로 가정했으므로 1번 노드부터 DFS 진행

for i in range(2, N+1):
    print(Parents[i])