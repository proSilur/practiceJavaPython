for i in range(int(input())):
    x = 1
    a, b = [int(i) for i in input().split()]
    for i in range(b):
        d = a / x
        r = (x + d) / 2
        x = r
    print("%.7f " % x)