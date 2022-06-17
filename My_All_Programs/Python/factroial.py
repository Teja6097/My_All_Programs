#n= int(input("Enter the number: "))
#res=1
#for i in range(1,n+1):
 #   res=res*i
#print(res)

def fact(n):
    res=1
    for i in range(1,n+1):
        res=res*i
    return res
n1= int (input("Enter a number1: "))
#a=fact(n)
#print(a)
n2=int(input("Enter the number2: "))

for i in range(n1,n2+1):
    print(i,end=" ")
    print(fact(i))
