for i in range(int(input())):
    a, b, c = input().split()
    if pow(int(a), 2) + pow(int(b), 2) == pow(int(c), 2):
        print('R ')
    elif pow(int(a), 2) + pow(int(b), 2) <= pow(int(c), 2):
        print('O ')
    elif pow(int(a), 2) + pow(int(b), 2) >= pow(int(c), 2):
        print('A ')
