input()
c = input().split()

print(c[0], ' ')
z, x, y = 0, 1, 2

while y != len(c):
    print(round((float(c[z]) + float(c[x]) + float(c[y])) / 3, 10), ' ')
    z += 1
    x += 1
    y += 1
print(c[-1])