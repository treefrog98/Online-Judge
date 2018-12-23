num = pow(2,1000)
string = str(num)
list = []

for digit in string:
    list.append(int(digit))

print(sum(list))