n=int(input())
temp=n
k=str(n)
len1=len(k)
res=0
while(n!=0):
    rem=n%10
    x=pow(rem,len1)
    res+=x
    n//=10
if(res==temp):
    print("Yes")
else:
    print("No")




##def length(n):
##    count=0
##    while(n!=0):
##        n=n//10
##        count+=1
##    return count
##
##def CheckArm(n):
##    temp=n
##    len1=length(n)
##    res=0
##    while(temp!=0):
##        rem=temp%10
##        res+=pow(rem,len1)
##        temp//=10
##    if(res==n):
##        return 1
##    else:
##        return 0
##
##
##n=int(input("Enter a number: "))
##x=CheckArm(n)
##if(x==1):
##    print("Yes")
##else:
##    print("No")
















    
