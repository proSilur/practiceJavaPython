for i in range(int(input())):
    k, st = input().split()
    st = st[int(k):] + st[:int(k)]
    print(st)