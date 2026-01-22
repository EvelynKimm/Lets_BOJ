import math

N = int(input())
answer = 0


def isPrime(num):
    for i in range(2, int(math.sqrt(num) + 1)):
        if num % i == 0:
            return False
    return True


for i in range(N, 1003002):
    if i == 1:
        continue
    if str(i) == str(i)[::-1]:
        if isPrime(i) == True:
            answer = i
            break

print(answer)
