#11054

import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split()))
dp1 = [1 for i in range(N)]
dp2 = [1 for i in range(N)]
sub = [0] * N

for i in range(N):
    for j in range(i):
        if arr[i] > arr[j]: #현위치i가 이전위치 j보다 크다면
            #dp1[i]는 현 위치의 숫자와 이전 위치의 슷자+1 중 큰 것으로 저장
            dp1[i] = max(dp1[i], dp1[j]+1) 
            
arr.reverse() #주어진 수열을 역순으로 정렬해 LIS 알고리즘 사용

for i in range(N):
    for j in range(i):
        if arr[i] > arr[j]:
            dp2[i] = max(dp2[i], dp2[j]+1)
            
dp2.reverse() #LIS 알고리즘을 사용해 얻은 리스트를 다시 정방향으로 배열

for i in range(N):
    #이 두 dp리스트를 더해야 가장 긴 바이토닉 수열의 길이가 나옴
    sub[i] = dp1[i] + dp2[i]
    
#but 특정수가 dp1과 2에 중복으로 들어가므로 -1 해줄것    
print(max(sub)-1)