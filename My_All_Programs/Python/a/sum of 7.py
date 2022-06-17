m=int(input())
n=int(input())
s=0
for i in range(m,n+1):
    if(i%7==0):
        s=s+i
print(s)
