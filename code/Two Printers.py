import math

for i in range(int(input())):
    x, y, n = map(int, input().split())
    print(min((math.ceil((max((x, y)) / float(x + y)) * n) * min((x, y)),
               math.ceil((min((x, y)) / float(x + y)) * n) * max((x, y)))), ' ')
