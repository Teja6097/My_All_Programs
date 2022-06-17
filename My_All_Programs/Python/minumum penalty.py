n= int(input())
l=list(map(int,input().split()))
m=0
n=0
l.sort()
for i in l:
    m=abs(m-i)
k=n-1
while(k>=0):
    n=abs(n-l[k])
    k=k-1
print(m,n)
print(min(m,n))
