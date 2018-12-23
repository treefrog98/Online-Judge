def is5Power(num):
    # turn a num into a list of the digits
    x = []
    temp = str(num)
    for number in temp:
        x.append(int(number))

    # x now holds each digits
    sum = 0
    for elem in x:
        sum += (elem**5)

    if sum == num:
        return True

    return False


res = 0
for i in range(2,1000000):
    if(is5Power(i)):
        res += i
        print(i)
print(res)