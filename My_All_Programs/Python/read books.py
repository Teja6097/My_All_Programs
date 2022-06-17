def fact(n):
    res=1
    for i in range(1,n+1):
        res*=i
    return res
def ans(n):
    m=1000000007
    f=1
    for i in rang(0,n+1):
        f*=i
    return 
n=int(input())
s=fact(n)//(2*fact(n-2))
