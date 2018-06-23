for i in range(int(input())):
    x = 1
    a, b = [int(i) for i in input().split()]
    for i in range(b):
        x = (x + a / x) / 2
    print("%.7f " % x)