input()
arr = [int(i) for i in input().split()]
for i in arr:
    l = list()
    x = i
    counter = 0
    while x not in l:
        l.append(x)
        x = int(((x * x) / 100) % 10000)
        counter += 1
    print(counter, end=" ")