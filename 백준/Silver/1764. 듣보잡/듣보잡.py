import sys

a,b = map(int, input().split())
dic = {}

for i in range(a+b):
    name = sys.stdin.readline().strip()
    if name not in dic:
        dic[name] = 1 #처음 나오면 1 넣어줌
    else:
        dic[name]=dic[name]+1 #한번 더 나오면 +1해서 2가 되는 것

answer = []
for k, v in dic.items(): #dict의 키와 값을 한번에 부르는 .items()
    if v == 2: #이게 뭐지
        answer.append(k)
print(len(answer))
print('\n'.join(sorted(answer)), end='') 
#join은 ['a','b','v']이런 리스트를 'abv'의 문자열로 합쳐서 반환해주는 함수
#리스트를 문자열로 합치는 함수