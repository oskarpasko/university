n = int(input("Podaj stopień wielomianu: "))+1
x_zero = float(input("Podaj miejsce zerowe: "))
temp = [0] * n
result = [0] * n
wsp = [0] * n

for x in range(0, n):
    number = float(input("Podaj współczynnik: "))
    wsp[x] = number
    if(x==0):
        result[0] = x_zero * number
    if(x>0):
        temp[x] = result[x-1] * x_zero
        result[x] = temp[x] + number

print(f"W(x0)= {result[n-1]}")

print("W(x)/x-1 = ", end="")
check = n-1
for x in range(0, n):
    check-=1
    if(check>1):
        print(f"{result[x]}x^{check} +", end=" ")
    elif(check==0):
        print(f"1 +", end=" ")
    elif(check==1):
        print(f"{result[x]} +", end=" ")
    elif(check<1):
        print(f"{result[x]}/x-1", end=" ")
