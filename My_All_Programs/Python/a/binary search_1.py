l=list(map(int,input().split()))
x=int(input())
l.sort()
flag=0
low=0
high=len(l)-1
mid=0
while(low<=high):
    mid=(high+low)//2

    if(l[mid]<x):
        low=mid+1

    elif(l[mid]>x):
        high=mid-1

    else:
        ans=mid
        flag=1
        break
if(flag==1):
    print("key found")
else:
    print("Key not found")
        
