def bubble_sort(value):
    arr = [int(x) for x in input().split()]
    number_of_swaps = number_of_passes = 0
    for i in range(value):
        swapped = False
        for j in range(0, value - i - 1):
            if arr[j] > arr[j + 1]:
                number_of_swaps += 1
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True
        number_of_passes += 1
        if not swapped:
            break
    print(number_of_passes, number_of_swaps)


bubble_sort(int(input()))

# n = int(input())
# a = input().split(' ')
# t = 0
# m = 0
# sorted = False
# while not sorted:
#     sorted = True
#     for i in range(len(a) - 1):
#         if int(a[i]) > int(a[i+1]):
#             sorted = False
#             t += 1
#             a[i], a[i+1] = a[i+1], a[i]
#     m += 1
# print (m, t)
