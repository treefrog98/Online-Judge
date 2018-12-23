# Champernowne's Constant

x = ""
for i in range(1,10000000):
    x+= str(i)
print(int(x[0])*int(x[9])*int(x[99])*int(x[999])*int(x[9999])*int(x[99999])*int(x[999999]))