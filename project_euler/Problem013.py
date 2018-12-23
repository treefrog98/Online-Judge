numbers = open("numbers.txt","r")
sum = 0
for line in numbers:
    sum += long(line)
print(sum)