import sys
input=sys.stdin.readline
sys.setrecursionlimit(10**9)
n=int(input())
adj=[[]for _ in range(n+1)]
#입력받음
for i in range(n):
    L=list(map(int,input().split()))
    for j in range(len(L[1:])):
        if j%2==1:
            adj[L[0]].append((L[j],L[j+1]))

#dfs 들어가서 배열에 도착하는 곳까지의 거리 저장
def dfs(v,result):
    for a, b in adj[v]:
        if result[a] == -1:
            result[a]=result[v]+b
            dfs(a,result)

#임의의 점에서 최대 거리 저장
result1=[-1]*(n+1)
result1[1]=0
dfs(1,result1)


temp=0
index=0
#최대값일때의 인덱스값을 찾음
for i in range(1,len(result1)):
    if result1[i]>temp:
        temp=result1[i]
        index=i
#그 인덱스에서 시작하는 최대값 찾음
result2=[-1]*(n+1)
result2[index]=0
dfs(index,result2)
print(max(result2))