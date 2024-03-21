def solution(n):
    if (int(n**0.5) * int(n**0.5) == n):
        return ((n**0.5) + 1)**2
    else:
        return -1

def solution(n):
    if int(n**0.5) == n**0.5: #제곱수 판별
        return ((n**0.5)+1)**2 # 제곱근+1의 제곱수 반환
    else : 
        return -1 #제곱수 아니면 -1반환