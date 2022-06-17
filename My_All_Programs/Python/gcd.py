def gcd(a,b):
    if(a==0):
        return b
    if(b==0):
        return a
    if(a==b):
        return a
    if(a>b):
        return gcd(a-b,b)
    return gcd(a,b-a)







##x,y=map(int,input().split())
n=int(input())
count=0
l=[]
##print(gcd(x,y))
for i in range(1,n+1):
    res=gcd(i,n)
    if(res==1):
        count+=1
print(count)
##    for j in range(1,n+1):
##        res=gcd(i,j)
##        if(res==1):
##            print (i,j)
      
      
##            l.append(i)
##            l.append(j)
##len1=len(l)
##k=[]
##for i in l:
##    if i not in k:
##        k.append(i)
##len2=len(k)
##print(len2)
