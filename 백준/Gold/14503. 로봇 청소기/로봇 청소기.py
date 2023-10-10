#14503
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

n, m = map(int, input().split())
x, y, d = map(int, input().split())
#지도 입력받기
arr = [list(map(int, input().split())) for _ in range(n)]
#청소기 방문체크
visited = [[0] * m for _ in range(n)]

#시작 시 방문체크하고 카운트 하기
visited[x][y] = 1 
cnt  = 1

while True:
    flag = 0
    
    for _ in range(4): #4방향
        d = (d+3) %4 #왼쪽으로 한 칸 돌림을 구현
        nx = x + dx[d]
        ny = y + dy[d]

        if 0<= nx < n and 0 <= ny < m and arr[nx][ny] == 0:
            if visited[nx][ny] == 0:
                visited[nx][ny] = 1
                cnt += 1
                x = nx
                y = ny
                flag = 1 #청소했다는 뜻
                break


    #4방향 모두 청소할 수 없을 때
    #후진했을 때 벽이면 break
    #뒤가 벽이 아니라면 그 위치 다시 갱신
    if flag == 0: 
        if arr[x-dx[d]][y-dy[d]] == 1:
            print(cnt)
            break
        else:
            x, y = x-dx[d], y-dy[d]