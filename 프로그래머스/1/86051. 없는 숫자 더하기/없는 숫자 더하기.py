def solution(numbers):
    numList = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    result = 0
    
    for num in numList:
        if num not in numbers:
            result += num
            
    return result
