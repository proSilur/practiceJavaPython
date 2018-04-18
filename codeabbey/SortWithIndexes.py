input()
arr1 = [int(i) for i in input().split()]
res = sorted(arr1)
for x in res:
    print(arr1.index(x) + 1, end=" ")