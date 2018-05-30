n = int(input())
a = (int(i) for i in input().split(' '))
for i in a: 
    ret = 0
    for j in range(32):
        ret += (i & (1 << j)) >> j
    print(ret, ' ')