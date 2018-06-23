
#26 ‐ Greatest Common Divisor


def gcd(a, b):
    while b > 0:
        temp = b
        b = a % b
        a = temp
    return a


def lcm(a, b):
    return a * (b / gcd(a, b))


for i in range(int(input())):
    a, b = map(int, input().split())
    print("(" + str(gcd(a, b)), str(int(lcm(a, b))) + ")", end=" ")
