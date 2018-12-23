#Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.

num = 1
x = True
while x:
    check = 1
    for i in range(2,7):
        if sorted(set(str(i*num))) != sorted(set(str(num))):
            check = 0
            break
    if check:
        print(num)
        break
    num += 1