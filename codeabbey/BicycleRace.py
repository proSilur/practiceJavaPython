for i in range(int(input())):
    a, b, c = map(int, input().split())
    print(str(round((a / (b + c)) * b, 10)), ' ')