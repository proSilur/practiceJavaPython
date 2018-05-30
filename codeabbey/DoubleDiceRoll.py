for i in range(int(input())):
    a, b = map(int, input().split())
    print(((a % 6) + 1) + ((b % 6) + 1), " ")
