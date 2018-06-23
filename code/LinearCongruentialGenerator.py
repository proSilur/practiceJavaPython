
def x(a, c, m, xo, n):
    for i in range(int(n)):
        xo = (a * xo + c) % m
    return xo

for i in range(int(input())):
    a, c, m, xo, n = map(int, input().split())
    print(x(a, c, m, xo, n), ' ')
