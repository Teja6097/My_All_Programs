##def CheckPrime(n):
##    flag=0
##    for i in range(2,(n//2)+1):
##        if(n%i==0):
##            flag=1
##            break
##    if(flag==0 or n==2):
##        return 1
##    else:
##        return 0
##
##n= int(input("Enter A number: "))
##x=CheckPrime(n)
##if(x==1):
##    print("Yes")
##else:
##    print("No")


def CheckPrime(n):
    flag=0
    for i in range(2,(n//2)+1):
        if(n%i==0):
            flag=1
            break
    if(flag==0 or n==2):
        return 1
    else:
        return 0

n1= int(input("Enter the starting number: "))
n2=int(input("Enter the ending number: "))
flag=0
for i in range(n1,n2+1):
    x=CheckPrime(i)
    if(x==1):
        print(i,end=" ")
        flag=1
if(flag==0):
    print("No prime numbers found ")























        
