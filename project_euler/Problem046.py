import math

def prime(n):
    if n <= 1:
        return False
    if n%2 == 0 and n > 2:
        return False
    for i in range(3, int(math.sqrt(n)+1),2):
        if n % i == 0:
            return False
    return True


n = 9
while True:
    if not prime(n):
        m = 1
        while m < n:
            if(prime(n-(2*m*m))):
                break
            m += 1
        if m == n:
            print(n)
            break
        n+= 2