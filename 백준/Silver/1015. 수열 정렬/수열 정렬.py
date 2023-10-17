#1015
import sys

input = sys.stdin.readline

N = int(input())
array = list(map(int, input().split()))
sorted_array = sorted(array)

result = [0] * N

for i in range(N):
    idx = sorted_array.index(array[i])
    result[i] = idx
    sorted_array[idx] = -1 
    #방문처리 혹은 같은 값이 있을 때 처리를 위함

# '*'를 사용하여 리스트를 순회하며 출력하는 것을 편리하게 할 수 있음
print(*result)
