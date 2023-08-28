#11651
#투포인터 문제
import sys

input = sys.stdin.readline

N = int(input())
solution = list(map(int, input().split()))

solution.sort() #용액의 특성값 담은 리스트를 정렬시킴

#포인터는 리스트의 양끝을 가리켜 점차 0으로 접근하도록 한다
start = 0
end = N-1

ans = abs(solution[start] + solution[end])
final = [solution[start], solution[end]]

while start < end:
    left = solution[start]
    right = solution[end]

    #두 개의 포인터가 가리키는 값을 더해 sum을 구함
    sum = left + right 

    #두 용액의 합의 절댓값이 기존의 ans 절댓값보다 작은 경우 ans에 새로운 값을 입력하고
    #left, right를 통해 index값을 저장해준다. 
    if abs(sum) < ans:
        ans = abs(sum)
        final = [left, right]
        #0인 경우 while문 종료하고 결과 출력
        if ans == 0: 
            break

    #음의 특성값의 절댓값이 양의 특성값의 절댓값보다 크기 때문에 start+=1을 통해 
    #두 용액의 특성값의 합이 0에 가까워 질 수 있도록 한다.
    if sum < 0: 
        start += 1

    #양의 특성값의 절댓값이 음의 특성값의 절댓값보다 크기 때문에 end-=1을 통해 
    #두 용액의 특성값의 합이 0에 가까워 질 수 있도록 한다.
    else:  
        end -= 1

print(final[0], final[1])