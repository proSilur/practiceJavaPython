#23 ‐ Bubble in Array

def checksum(array):
    summ = 0
    for i in array:
        summ = ((summ + i) * 113) % 10000007
    return summ


arr = [int(i) for i in input().split()]
arr.pop() # pop() если без параметра - удаление последнего элемента
# del arr[len(arr) - 1]
count = 0

for i in range(len(arr) - 1):
    if arr[i] > arr[i + 1]:
        count += 1
        temp = arr[i]
        arr[i] = arr[i + 1]
        arr[i + 1] = temp

print(count, checksum(arr))
