import sys

s = sys.stdin.readline().rstrip()
stack = []
ret = 0

for i in s:
    if i == '(': #여는 괄호가 나오면 stack에 넣어둠
        stack.append(i)
    else: #닫는 괄호가 나왔을 때,
        if stack: #여는 괄호가 있다면 짝이 맞으므로 stack의 여는 괄호 pop
            stack.pop()
        else: #여는 괄호가 없다면 짝이 맞지 않으므로 +1
            ret += 1

result = ret + len(stack) #짝이 맞지 않아 stack에 남아있는 값 + ret
print(result)