



def isPalindrome(n):  
    temp=n            
    res=0
    while(temp!=0):
        rem=temp%10
        res=res*10+rem
        temp//=10
    if(res==n):
        return 1
    else:
        return 0

def isPrime(n):
    flag=0

    for i in range(2,(n//2)+1):
        if(n%i==0):
            flag=1
            break
    if((flag==0 or n==2)and (n!=0 and n!=1)):
        return 1
    else:
        return 0



t=int(input())
for z in range(0,t):
    r1,r2=map(int,input().split())
    int(r1)
    int(r2)
    count=0
    for i in range(r1,r2+1):
        x1=isPalindrome(i)
        x2=isPrime(i)
        if(x1==1 and x2==1):
            count+=1
    print(count)

